package org.shortest_path_problem.omsu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GraphInput {
    public static double[][] randomInput(int size) {
        // TODO
        return null;
    }

    public static double[][] fileInput() {
        Scanner scanner = null;
        try{
            scanner = new Scanner(new File("Input.txt"));
            ArrayList<String> lines = new ArrayList<>();
            int size = 0;
            String line;

            if(scanner.hasNextLine()){ //enter the Stream to the List
                line = scanner.nextLine();
                lines.add(line);
                size = line.split(" ").length; //enter the suitable size for NxN matrix
            }
            while(scanner.hasNextLine()){ //enter the Stream to the List
                line = scanner.nextLine();
                lines.add(line);
                if(line.split(" ").length != size){ //check is the size NxN
                    throw new ArrayIndexOutOfBoundsException();
                }
            }
            if(lines.size() != size){ //check is the size NxN
                throw new ArrayIndexOutOfBoundsException();
            }

            int i = 0;
            double[][] graph = new double[size][size]; //add all the staff to graph array
            for(String l: lines){
                String[] el= l.split(" ");
                for (int j = 0; j < size; j++) {
                    if(!el[j].equals("inf")){ // check, if the data correct
                        graph[i][j] = Double.parseDouble(el[j]);
                    }
                    else{
                        graph[i][j] = Double.POSITIVE_INFINITY;
                    }
                }
                i++;
            }

            scanner.close();
            return graph;
        }
        catch (FileNotFoundException e){
            System.out.println("File doesn't exist");
            return new double[0][0];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You should enter the square matrix");
            scanner.close();
            return new double[0][0];
        }
        catch (NumberFormatException e) {
            System.out.println("You entered the wrong type of data. You possible to enter the numbers or inf (for infinite)");
            scanner.close();
            return new double[0][0];
        }
    }
}
