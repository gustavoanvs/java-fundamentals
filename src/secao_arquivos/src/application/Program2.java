package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args){

        File file = new File("H:\\Estudos\\Java\\file.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))){ //try with resources
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
