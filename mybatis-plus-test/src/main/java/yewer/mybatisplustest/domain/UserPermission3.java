package yewer.mybatisplustest.domain;

import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class UserPermission3 {
    private Integer id;

    private String name;

    private String password;

    private Set<String> permissions;

}
