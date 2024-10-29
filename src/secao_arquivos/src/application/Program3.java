package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {

    public static void main(String[] args){

        String[] lines = new String[] {"Good Morning", "Good afternoon", "Good Night"};

        String path = "H:\\Estudos\\Java\\file2 .txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){ //se eu colocar true no parametro ex: (path, true) ele inclui mais conteudos abaixo.
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
