package ex_array;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo_for_each {
    static public void main(String[] args){


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] array = new String[] {"Gustavo", "João", "Maria"};

        for (int i = 0; i< array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("----------------");

        for (String obj : array){
            System.out.println(obj);
        }

        sc.close();
    }
}
