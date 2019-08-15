package com.lungesoft.architecture.core;

import com.lungesoft.architecture.core.jpa.entity.Project;
import com.lungesoft.architecture.core.jpa.repository.ProjectRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class Resource02Application {

    private static final Logger log = LoggerFactory.getLogger(Resource02Application.class);

    public static void main(final String[] args) {
        SpringApplication.run(Resource02Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(ProjectRepository repository) {
        return (args) -> {
            repository.save(new Project("50 sombras de gray"));
            repository.save(new Project("Dorian Gray"));
            repository.save(new Project("Canterbury Tales"));
            repository.save(new Project("Paradise Lost"));

            // fetch all Users
            log.info("Project found with findAll():");
            for (Project project : repository.findAll()) {
                log.info(project.getTitle());
            }
            log.info("");
        };
    }

}
