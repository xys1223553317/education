package com.jk.xys.service.impl;

import com.jk.xys.dao.LoginDao;
import com.jk.xys.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;
}
