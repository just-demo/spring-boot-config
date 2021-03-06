package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class RedisConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RedisConfigServerApplication.class, args);
    }
}
