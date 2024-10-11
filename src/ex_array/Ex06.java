package ex_array;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

    /*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
    mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
    os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.*/

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;
        double soma, media;

        System.out.print("Quantos numeros você digitará? ");
        N = sc.nextInt();

        double[] vetor = new double[N];

        for (int i = 0; i< N; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        soma = 0;
        for (int i = 0; i< N; i++) {
            soma = soma + vetor[i];
        }

        media = soma / N;

        System.out.printf("\nMedia = %.3f\n", media);
        System.out.println("Abaixo da media:");

        for (int i = 0; i< N; i++) {
            if (vetor[i] < media) {
                System.out.printf("%.1f\n", vetor[i]);
            }
        }

        sc.close();

    }

}
