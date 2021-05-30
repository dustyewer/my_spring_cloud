package yewer.mybatisplustest.domain;

import lombok.Data;

import java.util.List;
@Data
public class UserPermission {
    private Integer id;

    private String name;

    private String password;

    private List<Permission> permissions;

}
