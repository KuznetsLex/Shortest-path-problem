package org.shortest_path_problem.omsu.web_app;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.shortest_path_problem.omsu.Path;
import org.shortest_path_problem.omsu.data_types.PathAndDistance;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ShortestPathController {

    @Operation(
        summary = "Найти кратчайший путь в графе",
        description = "Метод для поиска кратчайшего пути между двумя точками в графе, используя указанный алгоритм.",
        responses = {
            @ApiResponse(responseCode = "200", description = "Алгоритм отработал корректно",content = @Content(
                mediaType = "application/json",
                examples = @ExampleObject(
                    name = "Пример вывода",
                    value = "{\n" + //
                                                "    \"path\": [\n" + //
                                                "        3,\n" + //
                                                "        5,\n" + //
                                                "        1\n" + //
                                                "    ],\n" + //
                                                "    \"distance\": 7.0\n" + //
                                                "}"
                )
            )),
            @ApiResponse(responseCode = "400", description = "Ошибка в запросе", content = @Content(
                mediaType = "application/json",
                examples = @ExampleObject(
                    name = "Требования к запросу",
                    value = "Наличие полей graph, start, end, algorithm. Возможные алгоритмы см. в Schemas"
                )
            )),
            @ApiResponse(responseCode = "500", description = "Ошибка сервера", content = @Content(
                mediaType = "application/json"
            ))
        }
    )
    @PostMapping("/shortest-path")
    public PathAndDistance findShortestPath(@RequestBody GraphRequest request) {
        int s = request.getStart();
        int t = request.getEnd();
        double[][] matrix = request.getGraph();

        return switch (request.getAlgorithm()) {
            case "dijkstra" -> Path.pathForDijkstra(s, t, matrix);
            case "bellman-ford" -> Path.pathForBellmanFord(s, t, matrix);
            case "floyd-warshall" -> Path.pathForFloydWarshall(s, t, matrix);
            default -> throw new IllegalArgumentException("Unknown algorithm: " + request.getAlgorithm());
        };
    }
}
