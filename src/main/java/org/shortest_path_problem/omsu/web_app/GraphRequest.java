package org.shortest_path_problem.omsu.web_app;

public class GraphRequest {
    private double[][] graph;
    private int start;
    private int end;
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
