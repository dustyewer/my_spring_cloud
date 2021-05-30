package yewer.exceptionhandlertest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("yewer.exceptionhandlertest.mapper")
@EnableDiscoveryClient
public class ExceptionHandlerTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExceptionHandlerTestApplication.class, args);
    }

}
