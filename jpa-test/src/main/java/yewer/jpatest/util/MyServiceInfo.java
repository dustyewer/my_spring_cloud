package yewer.jpatest.util;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.boot.web.server.WebServer;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class MyServiceInfo implements ApplicationListener<WebServerInitializedEvent> {

    private static WebServer webServer;

    @Override
    public void onApplicationEvent(WebServerInitializedEvent webServerInitializedEvent) {
        webServer=webServerInitializedEvent.getWebServer();
    }

    public static WebServer getWebServer(){
        return webServer;
    }
}
