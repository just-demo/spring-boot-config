package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class VaultConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(VaultConfigServerApplication.class, args);
    }
}
