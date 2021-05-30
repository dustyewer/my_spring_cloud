package yewer.exceptionhandlertest.model;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @TableName user
 */
@Data
public class User implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String password;

    private static final long serialVersionUID = 1L;
}
