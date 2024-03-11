package org.shortest_path_problem.omsu;

import org.shortest_path_problem.omsu.data_types.PathAndDistance;
import org.shortest_path_problem.omsu.utilities.GraphInput;
import org.shortest_path_problem.omsu.utilities.VertexExistenceCheck;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.max;

// ВОПРОСЫ
// 1) Как сохранить и закрыть приложение блокнот?
// 2) Как заставлять пользователя делать инпут, пока ловится исключение?
// 3) Как сделать возврат в "главное меню"?
// 4) output может быть не инициализирован

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Shortest Path Finder!");
        int inputMode = 0;
        int s = -1, t = -1;
        int algorithm = 0;
        Scanner sc = new Scanner(System.in);
        double[][] graphWeightMatrix = new double[0][0];
        PathAndDistance output;
        try {
            while (!(inputMode == 1 || inputMode == 2)) {
                System.out.print("How to input graph? (1 - manually, 2 - randomly): ");
                inputMode = sc.nextInt();
            }
        }
        catch (InputMismatchException e) {
            System.out.println("НЕ ЗНАЮ КАК ЗАЦИКЛИТЬ, TODO");
        }
        File file = new File("src/main/java/org/shortest_path_problem/omsu/utilities/Input.txt");
        try {
            if (inputMode == 1) {
                java.awt.Desktop.getDesktop().edit(file);
                graphWeightMatrix = GraphInput.fileInput();
            }
            if (inputMode == 2) {
                System.out.print("How many vertices are there in the graph? : ");
                graphWeightMatrix = GraphInput.randomInput(sc.nextInt());
                java.awt.Desktop.getDesktop().open(file);
                //проблема: если не закрыть файл и вызвать программу еще раз -- непонятно, что получится
                // (во вскяком случае отобразиться устаревший файл)
            }
        }
        catch (IOException e) {
            System.out.println("Something went wrong...");
        }
        while (!VertexExistenceCheck.graphContains(graphWeightMatrix, max(s, t))) {
            System.out.print("Input start and finish of the path (number of vertices 0 to n-1): ");
            s = sc.nextInt();
            t = sc.nextInt();
        }
        System.out.print("Choose the algorithm (1 - Dijkstra, 2 - Bellman-Ford, 3 - Floyd-Warshall): ");
        algorithm = sc.nextInt();
        System.out.println("Processing...");
        switch (algorithm) {
            case 1:
                output = Path.pathForDijkstra(s, t, graphWeightMatrix);
            case 2:
                output = Path.pathForBellmanFord(s, t, graphWeightMatrix);
            case 3:
                output = Path.pathForFloydWarshall(s, t, graphWeightMatrix);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + algorithm);
        }
        System.out.println("Path: " + output.getPath().toString() + ", distance: " + output.getDistance());




    }
}
