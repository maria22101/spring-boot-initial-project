package ua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ua.java_training.springboot_initial_project.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringBootInitialProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootInitialProjectApplication.class, args);
	}
}
