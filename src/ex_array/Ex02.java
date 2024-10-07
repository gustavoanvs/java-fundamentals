package ex_array;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    /*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
    - Imprimir todos os elementos do vetor
    - Mostrar na tela a soma e a média dos elementos do vetor*/

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double sum, med;

        System.out.print("Quantos numeros você digitará? ");
        n = sc.nextInt();

        double[] array = new double[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            array[i] = sc.nextDouble();
        }

        sum = 0;
        for (int i=0; i<n; i++) {
            sum = sum + array[i];
        }

        med = sum / n;

        System.out.print("Valores:");

        for (int i=0; i<n; i++) {
            System.out.printf("%.1f  ", array[i]);
        }

        System.out.printf("\nSoma: %.2f\n", sum);
        System.out.printf("Media: %.2f\n", med);

        sc.close();
    }

}
