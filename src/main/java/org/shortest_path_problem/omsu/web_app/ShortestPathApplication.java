package org.shortest_path_problem.omsu.web_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
    info = @Info(
        title = "Shortest Path Finder API",
        version = "1.0",
        description = "API для поиска кратчайшего пути в графе с использованием различных алгоритмов."
    )
)

@SpringBootApplication
public class ShortestPathApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShortestPathApplication.class, args);
    }
}
