package yewer.securitytest.entity;

import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author makejava
 * @since 2021-05-23 20:50:45
 */
public class Role implements Serializable {
    private static final long serialVersionUID = -72437447331879700L;

    private Integer id;

    private String role;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
