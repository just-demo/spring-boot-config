package demo;

import org.springframework.cloud.config.server.environment.EnvironmentRepositoryFactory;

public class CustomEnvironmentRepositoryFactory implements EnvironmentRepositoryFactory<CustomEnvironmentRepository, CustomEnvironmentProperties> {
    @Override
    public CustomEnvironmentRepository build(CustomEnvironmentProperties environmentProperties) throws Exception {
        return new CustomEnvironmentRepository();
    }
}
