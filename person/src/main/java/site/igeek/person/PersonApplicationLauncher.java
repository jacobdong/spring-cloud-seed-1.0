package site.igeek.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by jacobdong on 16/6/22.
 */
@SpringBootApplication
@EnableEurekaClient
public class PersonApplicationLauncher {

    public static void main(String[] args) {
        SpringApplication.run(PersonApplicationLauncher.class, args);
    }
}
