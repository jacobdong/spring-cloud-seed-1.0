package site.igeek.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by jacobdong on 16/6/22.
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigApplicationLauncher {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplicationLauncher.class, args);
    }
}
