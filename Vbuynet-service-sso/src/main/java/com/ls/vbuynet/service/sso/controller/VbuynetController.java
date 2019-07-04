package com.ls.vbuynet.service.sso.controller;

import com.ls.vbuynet.commons.domain.User;
import com.ls.vbuynet.commons.dto.AbstractBaseResult;
import com.ls.vbuynet.commons.util.CookieUtils;
import com.ls.vbuynet.commons.util.MapperUtils;
import com.ls.vbuynet.commons.web.AbstractBaseController;
import com.ls.vbuynet.service.redis.service.RedisService;
import com.ls.vbuynet.service.sso.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@RestController
public class VbuynetController extends AbstractBaseController<User> {

    @Autowired
    private UserService userService;

    @Autowired
    private RedisService redisService;
//    /**
//     * 跳转登录页
//     *
//     * @return
//     */
//    @RequestMapping(value = "login", method = RequestMethod.GET)
//    public String login(
//            @RequestParam(required = false) String url,
//            HttpServletRequest request, Model model) {
//        String token = CookieUtils.getCookieValue(request, "token");
//
//        // token 不为空可能已登录
//        if (StringUtils.isNotBlank(token)) {
//            String loginCode = (String) redisService.get(token);
//            if (StringUtils.isNotBlank(loginCode)) {
//                String json = (String) redisService.get(loginCode);
//                if (StringUtils.isNotBlank(json)) {
//                    try {
//                        User user = MapperUtils.json2pojo(json, User.class);
//                        // 已登录
//                        if (user != null) {
//                            if (StringUtils.isNotBlank(url)) {
//                                return "redirect:" + url;
//                            }
//                        }
//
//                        // 将登录信息传到登录页
//                        model.addAttribute("User", user);
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }
//
//        if (StringUtils.isNotBlank(url)) {
//            model.addAttribute("url", url);
//        }
//
//        return "login";
//    }

    /**
     * 登录业务
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public AbstractBaseResult login(
            @RequestParam(required = true) String username,
            @RequestParam(required = true) String password,
            @RequestParam(required = false) String url,
            HttpServletRequest request, HttpServletResponse response) {
        User user = userService.selectALL(username, password);

        // 登录失败
        if (user == null) {
            return error("message","用户名或密码错误");
        }

        // 登录成功
        else {
            String token = UUID.randomUUID().toString();

            // 将 Token 放入缓存
            redisService.put(token, username, (long) (60 * 60 * 24));
                CookieUtils.setCookie(request, response, "token", token, 60 * 60 * 24);
                if (StringUtils.isNotBlank(url)) {
                    return success(url,user);
            }

            // 熔断处理
            else {
                return success("登录成功",user);
            }
        }
    }

    /**
     * 注销
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request, HttpServletResponse response, @RequestParam(required = false)Model model) {
        try {
            CookieUtils.deleteCookie(request, response, "token");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "已注销";
    }
}
