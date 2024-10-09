package ex_array;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {

    /*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
    o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
    considerando a primeira posição como 0 (zero).*/

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, posicao;
        double maior;

        System.out.print("Quantos numeros você digitará? ");
        N = sc.nextInt();

        double[] vetor = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        maior = vetor[0];
        posicao = 0;

        for (int i = 1; i< N; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicao);

        sc.close();
    }

}
