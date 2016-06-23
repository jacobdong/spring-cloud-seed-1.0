package site.igeek.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by jacobdong on 16/6/22.
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplicationLauncher {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryApplicationLauncher.class, args);
    }
}
