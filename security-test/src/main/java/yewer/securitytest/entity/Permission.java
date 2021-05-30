package yewer.securitytest.entity;

import java.io.Serializable;

/**
 * (Permission)实体类
 *
 * @author makejava
 * @since 2021-05-23 20:50:45
 */
public class Permission implements Serializable {
    private static final long serialVersionUID = -60100192027770052L;

    private Integer id;

    private String permission;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

}
