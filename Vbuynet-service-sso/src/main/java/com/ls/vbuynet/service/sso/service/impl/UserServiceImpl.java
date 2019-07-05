package com.ls.vbuynet.service.sso.service.impl;

import com.ls.vbuynet.commons.domain.User;
import com.ls.vbuynet.commons.mapper.UserMapper;
import com.ls.vbuynet.commons.util.MapperUtils;
import com.ls.vbuynet.service.redis.service.RedisService;
import com.ls.vbuynet.service.sso.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisService redisService;

    @Autowired
    private HttpSession session;

    @Override
    public User selectALL(String username, String password) {
        User user = null;

        String json = (String) redisService.get(username);

        if(json!=null) {
            Example example = new Example(User.class);
            example.createCriteria().andEqualTo("username", username);
            user = userMapper.selectOneByExample(example);
            if (user != null && user.getPassword().equals(password)) {
                try {
                    session.setAttribute("user",user.getId());
                    redisService.put("username", username, (long) (60*60*24));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return user;
            }

            else{
                return null;
            }
        }
        else{
            try {
                user = MapperUtils.json2pojo(json, User.class);
            } catch (Exception e) {
                logger.warn("触发熔断：{}", e.getMessage());
            }
        }
        return user;
    }
}
