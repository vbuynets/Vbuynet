package com.ls.vbuynet.service.provider.site.service;

import com.ls.vbuynet.commons.domain.Site;
import com.ls.vbuynet.commons.mapper.SiteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class VbuynetSiteServiceImpl implements VbuynetSiteService {

    @Autowired
    private SiteMapper siteMapper;

    /**
     * 新增地址
     * @param site
     * @return
     */
    @Override
    public int insertSite(Site site) {
        int insert = siteMapper.insertSelective(site);
        return insert;
    }

    /**
     * 根据用户id查询用户保存过的地址
     * @param userid
     * @return
     */
    @Override
    public List<Site> selectUserId(int userid) {
        Example example=new Example(Site.class);
        example.createCriteria().andEqualTo("userid",userid);
        List<Site> sites = siteMapper.selectByExample(example);
        return sites;
    }
}
