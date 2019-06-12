package com.jk.xys.LoginController;

import com.jk.xys.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
public class LoginController {
    @Autowired
    public LoginService loginService;
   @RequestMapping("onlineLogin")
    public HashMap<String,Object> onlineLogin(){
       return null;
   }
}
