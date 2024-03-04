package org.shortest_path_problem.omsu.data_types;

import java.util.List;
import java.util.Arrays;

public class PathAndDistance {
    private List<Integer> path;
    private int distance;

    public PathAndDistance(List<Integer> path, int distance) {
        this.path = path;
        this.distance = distance;
    }

    public List<Integer> getPath() {
        return path;
    }

    public void setPath(List<Integer> path) {
        this.path = path;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "PathAndDistance{" +
                "path=" + path +
                ", distance=" + distance +
                '}';
    }
}
