package yewer.mybatisplustest.domain;

import lombok.Data;

import java.util.List;

@Data
public class UserPermission2 {
    private Integer id;

    private String name;

    private String password;

    private List<String> permissions;

}
