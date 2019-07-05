package com.ls.vbuynet.service.provider.qq.service;

import com.ls.vbuynet.commons.domain.Validation;

public interface VbuynetQQService {
    /**
     * 根据id查询qq
     * @param id
     * @return
     */
    Validation condition(int id);
}
