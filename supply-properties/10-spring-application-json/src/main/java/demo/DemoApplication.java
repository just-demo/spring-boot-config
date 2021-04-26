package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        // All supported ways:
        // SPRING_APPLICATION_JSON='{"demo":{"value":"10"}}'    // environment variable
        // -Dspring.application.json='{"demo":{"value":"10"}}'  // system property
        // --spring.application.json='{"demo":{"value":"10"}}'  // command line argument
        // java:comp/env/spring.application.json                // JNDI variable
        System.setProperty("SPRING_APPLICATION_JSON", "{\"demo\":{\"value\":\"10\"}}");
        // System.setProperty("spring.application.json", "{\"demo\":{\"value\":\"10\"}}");
        // args = new String[]{"--spring.application.json={\"demo\":{\"value\":\"10\"}}"};
        SpringApplication.run(DemoApplication.class, args);
    }
}
