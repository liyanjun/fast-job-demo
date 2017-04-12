
package org.li.module.sys.bean.vo;

import org.li.module.sys.bean.SysResource;

import java.util.ArrayList;
import java.util.List;

public class ResourceTree {

    private Integer id;
    private int pId;
    private String text;
    private boolean open;
    private boolean checked;
    private List<ResourceTree> nodes;

    private ResourceTree(Integer id, int pid, String text, boolean isChecked) {

        this.id = id;
        this.pId = pid;
        this.text = text;
        this.open = true;
        checked = isChecked;
        nodes = new ArrayList<>();
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public int getpId() {

        return pId;
    }

    public void setpId(int pId) {

        this.pId = pId;
    }

    public String getText() {

        return text;
    }

    public void setText(String text) {

        this.text = text;
    }

    public boolean isOpen() {

        return open;
    }

    public void setOpen(boolean open) {

        this.open = open;
    }

    public boolean isChecked() {

        return checked;
    }

    public void setChecked(boolean checked) {

        this.checked = checked;
    }

    public static ResourceTree toResource(SysResource r, boolean isChecked) {
        ResourceTree t = new ResourceTree(r.getId(), r.getPid(), r.getName(), isChecked);
        return t;
    }

    public ResourceTree addNode(ResourceTree resourceTree){
        nodes.add(resourceTree);
        return this;
    }
}
