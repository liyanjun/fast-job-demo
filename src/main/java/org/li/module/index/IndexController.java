
package org.li.module.index;

import com.google.gson.Gson;
import org.li.module.sys.bean.SysResource;
import org.li.module.sys.bean.vo.ResourceTree;
import org.li.module.sys.service.SysResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Controller
@RequestMapping(value = "/admin")
public class IndexController {

    @Autowired
    private SysResourceService sysResourceService;

    @RequestMapping("")
    public String index(Model model) {
        return "/index";
    }

}
