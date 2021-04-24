package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class NativeFileConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeFileConfigServerApplication.class, args);
    }
}
