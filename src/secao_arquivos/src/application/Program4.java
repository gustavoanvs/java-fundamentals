package application;

import java.io.File;
import java.util.Scanner;

public class Program4 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String srtPath = sc.nextLine(); //H:\Estudos\Java

        File path = new File(srtPath);

        System.out.println("Get Name: " + path.getName());
        System.out.println("Get Folder: " + path.getParent());
        System.out.println("Get Path: " + path.getPath());

        File[] folders = path.listFiles(File::isDirectory); //somente dir ou pasta
        File[] files = path.listFiles(File::isFile); //somente arquivos

        System.out.println("Folders:");
        for (File folder : folders){
            System.out.println(folder);
        }

        for (File file : files){
            System.out.println(file);
        }

        boolean success = new File(srtPath + "\\suasbdir").mkdir(); //criar uma sub pasta chamada subdir ...
        System.out.println("Dir created: " + success);

        sc.close();

    }

}
