package ex_array;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

    //Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
    //e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

    static public void main(String[] args){


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você digitará? ");

        int N = sc.nextInt();

        int[] array = new int[N];

        for (int i = 0; i< N; i++) {
            System.out.print("Digite um numero: ");
            array[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos:");

        for (int i = 0; i< N; i++) {
            if (array[i] < 0) {
                System.out.printf("%d\n", array[i]);
            }
        }

        sc.close();
    }
}
