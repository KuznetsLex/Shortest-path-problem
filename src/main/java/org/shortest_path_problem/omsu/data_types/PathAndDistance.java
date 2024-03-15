package org.shortest_path_problem.omsu.data_types;

import java.util.List;
import java.util.Objects;

public class PathAndDistance {
    private List<Integer> path;
    private double distance;

    public PathAndDistance(List<Integer> path, double distance) {
        this.path = path;
        this.distance = distance;
    }

    public List<Integer> getPath() {
        return path;
    }

    public void setPath(List<Integer> path) {
        this.path = path;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PathAndDistance that = (PathAndDistance) o;
        return Double.compare(distance, that.distance) == 0 && Objects.equals(path, that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, distance);
    }

    @Override
    public String toString() {
        return "PathAndDistance{" +
                "path=" + path +
                ", distance=" + distance +
                '}';
    }
}
