package org.shortest_path_problem.omsu.web_app;

import org.shortest_path_problem.omsu.Path;
import org.shortest_path_problem.omsu.data_types.PathAndDistance;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ShortestPathController {

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
