package org.li.admin;

import com.wordnik.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.li.module.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/3/7.
 */
@Controller
@RequestMapping("/admin")
public class AdminIndexController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String login() {
        if(SecurityUtils.getSubject().isAuthenticated()){
            return "redirect:/index";
        }

        return "admin/login";
    }

    @RequestMapping("index")
    public void index() {
        System.out.println("adfas");
    }
}