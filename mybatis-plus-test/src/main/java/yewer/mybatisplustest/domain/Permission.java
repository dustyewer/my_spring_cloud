package yewer.mybatisplustest.domain;

import lombok.Data;

import java.io.Serializable;

/**
 *
 * @TableName permission
 */
@Data
public class Permission implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String permission;

    private static final long serialVersionUID = 1L;
}
