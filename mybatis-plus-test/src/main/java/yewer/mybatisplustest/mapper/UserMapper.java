package yewer.mybatisplustest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Select;
import yewer.mybatisplustest.domain.User;
import yewer.mybatisplustest.domain.UserPermission;
import yewer.mybatisplustest.domain.UserPermission2;
import yewer.mybatisplustest.domain.UserPermission3;

import java.util.List;

/**
 * @Entity generator.domain.User
 */
public interface UserMapper extends BaseMapper<User> {

    @Select("SELECT  permission from permission where permission.id in " +
            "(select permission from role_permission where role in" +
            "(select role from user_role,user where user_role.user=user.id and user.name=#{name}))")
    List<String> selectPermission(String name);

    UserPermission selectUserPermission(String name);

    UserPermission2 selectUserPermission2(String name);

    UserPermission3 selectUserPermission3(String name);

    User selectUser();


}




