package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        args = new String[]{"--demo.value=11"};
        SpringApplication.run(DemoApplication.class, args);
    }
}
