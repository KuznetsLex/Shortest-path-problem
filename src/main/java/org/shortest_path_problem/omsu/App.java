package org.shortest_path_problem.omsu;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Shortest Path Finder!");

        try {
            int inputMode = 0;
            while (!(inputMode == 1 || inputMode == 2)) {
                Scanner sc = new Scanner(System.in);
                System.out.print("How to input graph? 1 - manually, 2 - randomly: ");
                inputMode = sc.nextInt();
                System.out.println();
                if (inputMode == 1) {
                    File file = new File("Input.txt");
                    java.awt.Desktop.getDesktop().edit(file);
                }
                if (inputMode == 2) {
                    System.out.print("How many vertices are there in the graph? : ");
                    GraphInput.randomInput(sc.nextInt());
                }
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Vertices should exist in the graph! Repeat your input, please: ");
        }
        catch (IOException e) {
            System.out.println("Something went wrong...");
        }
    }
}
