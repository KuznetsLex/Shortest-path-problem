package org.shortest_path_problem.omsu.web_app;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Запрос для вычисления кратчайшего пути")
public class GraphRequest {

    @Schema(description = "Матрица смежности графа", example = "[\n" + //
                "    [0, 2, 5, 7.3, 3.2, 67],\n" + //
                "    [2, 0, 5, 34.2, 4, 12],\n" + //
                "    [5, 6, 0, 6.7, 34, 21],\n" + //
                "    [78, 24, 5.5, 0, 34, 4],\n" + //
                "    [4, 5, 56, 45, 0, 34.23],\n" + //
                "    [34, 3, 3, 43, 6.7, 0]\n" + //
                "],\n", required = true)
    private double[][] graph;

    @Schema(description = "Номер начальной вершины", example = "3", required = true)
    private int start;

    @Schema(description = "Номер конечной вершины", example = "1", required = true)
    private int end;

    @Schema(description = "Алгоритм для вычисления кратчайшего пути: dijkstra, bellman-ford, floyd-warshall", allowableValues = {"dijkstra", "bellman-ford", "floyd-warshall"}, example = "dijkstra", required = true)
    private String algorithm;

    // Геттеры и сеттеры
    public double[][] getGraph() {
        return graph;
    }

    public void setGraph(double[][] graph) {
        this.graph = graph;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }
}
