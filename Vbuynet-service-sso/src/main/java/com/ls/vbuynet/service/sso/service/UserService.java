package com.ls.vbuynet.service.sso.service;

import com.ls.vbuynet.commons.domain.User;

public interface UserService {
    User selectALL(String username,String password);
}
