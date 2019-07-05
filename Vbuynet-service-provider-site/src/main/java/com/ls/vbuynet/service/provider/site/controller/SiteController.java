package com.ls.vbuynet.service.provider.site.controller;

import com.ls.vbuynet.commons.domain.Site;
import com.ls.vbuynet.service.provider.site.service.VbuynetSiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class SiteController {


    @Autowired
    private VbuynetSiteService vbuynetSiteService;


    /**
     * 保存地址信息
     * @param site
     * @param session
     * @param Consigneename
     * @param siteName
     * @param consigneeSize
     * @param cellphone
     * @param phone
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "site/{Consigneename}/{siteName}/{consigneeSize}/{cellphone}/{phone}",method = RequestMethod.GET)
    public String insertsite(Site site,HttpSession session,
                             @PathVariable(value = "Consigneename") String Consigneename,
                             @PathVariable(value = "siteName") String siteName,
                             @PathVariable(value = "consigneeSize") String consigneeSize,
                             @PathVariable(value = "cellphone",required = false) int cellphone,
                             @PathVariable(value = "phone",required = false) int phone){
//        int userId =(int) session.getAttribute("user");
        site.setUserid(1);
        site.setConsigneename(Consigneename);
        site.setSitename(siteName);
        site.setConsigneesize(consigneeSize);
        site.setCellphone(cellphone);
        site.setPhone(phone);
        int i = vbuynetSiteService.insertSite(site);
        if(i>0){
            return "ok!";
        }
        return "No!";
    }

    /**
     * 根据用户id查询用户保存过的地址
     * @param userid
     * @return
     */
    @ResponseBody
    @GetMapping(value = "sites/{userid}")
    public String sites(@PathVariable(value = "userid") int userid){
        List<Site> sites = vbuynetSiteService.selectUserId(userid);
        for(Site site:sites){
            System.out.println(site.getConsigneename());
        }
        return null;
    }
}
