package yewer.feigntest.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceFallbackFactory implements FallbackFactory<FeignService> {
    @Override
    public FeignService create(Throwable throwable) {
        //比fallback强,能拿到异常得具体信息
        System.out.println(throwable);
        return new FeignServiceHystrix();
    }
}
