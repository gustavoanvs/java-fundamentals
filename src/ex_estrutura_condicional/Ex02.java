package ex_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[]args){
        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if(x % 2 == 0){
            System.out.println("É par");
        } else{
            System.out.println("É ímpar");
        }

        sc.close();
    }

}
