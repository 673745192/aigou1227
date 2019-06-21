package cn.itsource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer//开启
public class CnfigserverApplication8848 {
    public static void main(String[] args) {
        SpringApplication.run(CnfigserverApplication8848.class);

    }
}
