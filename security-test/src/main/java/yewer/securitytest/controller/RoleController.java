package yewer.securitytest.controller;

import yewer.securitytest.entity.Role;
import yewer.securitytest.service.RoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Role)表控制层
 *
 * @author makejava
 * @since 2021-05-23 20:50:45
 */
@RestController
@RequestMapping("role")
public class RoleController {
    /**
     * 服务对象
     */
    @Resource
    private RoleService roleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Role selectOne(Integer id) {
        return this.roleService.queryById(id);
    }

}
