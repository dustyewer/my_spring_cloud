# 工程简介



# 延伸阅读
## 开启熔断
feign.hystrix.enabled=true 
## 例子
    @Service
    @FeignClient(value = "jpa-test",fallback = UserServiceFallback.class)
    public interface UserService {
        //调用的controller里面怎么写,feign接口里面就怎么写
        @RequestMapping("service/user/{id}")
        User getUser(@PathVariable("id") Integer id);
    }

如果需要访问作为回退触发器的原因，则可以使用@FeignClient中的fallbackFactory属性。
同时设置fallback和fallbackfactory不可以的，会有有冲突，fallback生效，fallbackfactory不能使用，
fallbackFactory 是fallback的一个升级版,感觉也就多了一个拿回异常具体信息的功能.



