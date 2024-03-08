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

        class NotZeroWeightsException extends Exception{}

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
                        if(i==j && graph[i][j]!=0){// check, if the edges with one start and the same end have zero weight
                            throw new NotZeroWeightsException();
                        }
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
            return null;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You should enter the square matrix");
            scanner.close();
            return null;
        }
        catch (NumberFormatException e) {
            System.out.println("You entered the wrong type of data. You possible to enter the numbers or inf (for infinite)");
            scanner.close();
            return null;
        }
        catch (NotZeroWeightsException e){
            System.out.println("There should be only zero weights for edges that have the start and the end in one point");
            scanner.close();
            return null;
        }
    }
}
