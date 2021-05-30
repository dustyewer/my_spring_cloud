# 继承JpaRepository接口
    public interface UserDao extends JpaRepository<User,Integer> 

# 查询可以使用 Example 
    User user = new User();
    user.setName(name);
    ExampleMatcher matcher = ExampleMatcher.matching()
            .withMatcher("name", ExampleMatcher.GenericPropertyMatchers.contains())
            //忽略属性：是否关注。因为是基本类型，需要忽略掉
            .withIgnorePaths("id");
    Example<User> example = Example.of(user, matcher);
    List<User> userList = userDao.findAll(example);
