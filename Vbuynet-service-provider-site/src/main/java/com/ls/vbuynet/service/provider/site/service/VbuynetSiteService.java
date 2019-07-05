package com.ls.vbuynet.service.provider.site.service;

import com.ls.vbuynet.commons.domain.Site;
import com.ls.vbuynet.commons.domain.User;

import java.util.List;

public interface VbuynetSiteService {
    /**
     * 新增收货地址
     * @param site
     * @return
     */
    int insertSite(Site site);

    /**
     * 根据用户Id查询以保存的收货地址
     * @param
     * @return
     */
    List<Site> selectUserId(int userid);
}
