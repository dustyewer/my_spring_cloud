package yewer.securitytest.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import yewer.securitytest.entity.Role;
import yewer.securitytest.dao.RoleDao;
import yewer.securitytest.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Role)表服务实现类
 *
 * @author makejava
 * @since 2021-05-23 20:50:45
 */
@Service("roleService")
public class RoleServiceImpl extends ServiceImpl<RoleDao,Role> implements RoleService {

}
