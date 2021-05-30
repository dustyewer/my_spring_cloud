package yewer.mybatisplustest.domain;

import lombok.Data;

import java.io.Serializable;

/**
 *
 * @TableName role
 */
@Data
public class Role implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String role;

    private static final long serialVersionUID = 1L;
}
