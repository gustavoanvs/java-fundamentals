package ex_array;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    /*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
    terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
    o vetor C gerado*/

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        System.out.print("Quantos numeros você digitará? ");
        int N = sc.nextInt();

        Integer[] vetorA = new Integer[N];
        Integer[] vetorB = new Integer[N];
        Integer[] vetorC = new Integer[N];

        int total;

        for(int i=0; i < N; i++){
            System.out.println("Valor vetorA: ");
            vetorA[i] = sc.nextInt();

            System.out.println("Valor vetorB: ");
            vetorB[i] = sc.nextInt();
        }

        for (int i=0; i < N; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }


        System.out.println("Vetor C:");

        for (int i=0; i < N; i++) {
            System.out.printf("%d\n", vetorC[i]);
        }

        sc.close();

    }


}
