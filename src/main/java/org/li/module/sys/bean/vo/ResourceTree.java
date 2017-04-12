
package org.li.module.sys.bean.vo;

import org.li.module.sys.bean.SysResource;

public class ResourceTree {

    private Integer id;
    private int pId;
    private String name;
    private boolean open;
    private boolean checked;

    private ResourceTree(Integer id, int pid, String name, boolean isChecked) {

        this.id = id;
        this.pId = pid;
        this.name = name;
        this.open = true;
        checked = isChecked;
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

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
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
}
