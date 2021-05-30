package yewer.securitytest.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import yewer.securitytest.entity.User;

import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2021-05-23 20:50:46
 */
public interface UserDao extends BaseMapper<User> {
    List<Integer> getUserRole();

}

