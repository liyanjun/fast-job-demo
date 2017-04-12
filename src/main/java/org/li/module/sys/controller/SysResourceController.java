
package org.li.module.sys.controller;

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


@Controller("management.resourceController")
@RequestMapping(value = "/management/resource")
public class SysResourceController {

    @Autowired
    private SysResourceService sysResourceService;

    @RequestMapping("")
    public String list(Model model) {

        // List<User> userList = userMgr.searchUser(vo);
        // Integer totalCount = userMgr.searchUserNum(vo);
        List<SysResource> resList = sysResourceService.findAll();
        List<ResourceTree> treeList = new ArrayList<ResourceTree>();
        for (SysResource resource : resList) {
            treeList.add(ResourceTree.toResource(resource, false));
        }
        String resTree = new Gson().toJson(treeList);

        model.addAttribute("resTree", resTree);

        return "/management/resource/treeList.jsp";
    }

    @RequestMapping("/addPage")
    public String addPage(Model model, HttpServletRequest request) {

        model.addAttribute("parentId", request.getParameter("parentId"));
        model.addAttribute("resCode", UUID.randomUUID().toString().replaceAll("-", ""));
        return "/management/resource/add.jsp";
    }

    @RequestMapping("/editPage")
    public String editPage(Model model, HttpServletRequest request) {

        int id = Integer.parseInt(request.getParameter("id"));
        SysResource res = sysResourceService.find(id);
        model.addAttribute("vo", res);

        return "/management/resource/edit.jsp";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void add(SysResource res, HttpServletResponse response) {

        boolean isPass = sysResourceService.checkResourceCode(res.getResCode());
//        if (isPass) {
//            resMgr.addResource(res);
//            writeDwzSignal("200", getMessage("msg.operation.success"), "", request, response);
//        } else {
//            writeDwzSignal("500", "资源码重复", "", request, response);
//        }
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public void edit(SysResource res, HttpServletResponse response) {

        sysResourceService.updateSysResource(res);
    }

    @RequestMapping("/delete")
    public void delete(HttpServletResponse response) {

//        // TODO 有角色不能删除
//        int resId = Integer.parseInt(request.getParameter("id"));
//
//        resMgr.delResource(resId);
//
//        writeDwzSignal("200", getMessage("msg.operation.success"), "", request, response);
    }
}
