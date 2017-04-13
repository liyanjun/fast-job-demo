
package org.li.module.sys.controller;

import com.google.gson.Gson;
import org.li.common.base.page.PageInfo;
import org.li.common.base.page.PagerControl;
import org.li.module.sys.bean.SysResource;
import org.li.module.sys.bean.vo.ResourceTree;
import org.li.module.sys.service.SysResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Controller
@RequestMapping(value = "/resource")
public class SysResourceController {

    @Autowired
    private SysResourceService sysResourceService;

    @RequestMapping("")
    public String index(Model model) {
        return "/system/resource/list";
    }

    @RequestMapping("/list")
    @ResponseBody
    public PagerControl list(Model model, @RequestParam Integer parentId, PageInfo pageInfo,HttpServletResponse response) {
        SysResource sysResource = new SysResource();
        sysResource.setPid(parentId);
        PagerControl pagerControl = sysResourceService.page(sysResource,pageInfo,null,null);
        return pagerControl;
    }

    @RequestMapping("/tree")
    public String tree(Model model) {

        // List<User> userList = userMgr.searchUser(vo);
        // Integer totalCount = userMgr.searchUserNum(vo);
        List<SysResource> resList = sysResourceService.findAll();
        List<ResourceTree> treeList = new ArrayList<ResourceTree>();


        for (SysResource re: resList){
            if(re.getPid() == 0){
                ResourceTree resourceTree = ResourceTree.toResource(re, false);
                treeList.add(findChild(resourceTree,resList));
            }
        }
        String resTree = new Gson().toJson(treeList);

        model.addAttribute("rootNode", resTree);

        return "/system/resource_tree";
    }

    private ResourceTree findChild(ResourceTree resourceTree,List<SysResource> sysResources){
        for (SysResource subResource : sysResources) {
            if (subResource.getPid().intValue() == resourceTree.getId()){
                resourceTree.addNode(findChild(ResourceTree.toResource(subResource, false),sysResources));
            }
        }
        return resourceTree;
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
