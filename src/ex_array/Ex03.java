package ex_array;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {

    //Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
    //tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
    //bem como os nomes dessas pessoas caso houver.

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de pessoas:");

        int N = sc.nextInt();

        String[] nome = new String[N];
        Integer[] idade = new Integer[N];
        Double[] altura = new Double[N];

        //coletando informações
        for(int i=0; i < N; i++){
            System.out.println("Escreva o nome:");
            nome[i] = sc.next();

            System.out.println("Escreva a idade:");
            idade[i] = sc.nextInt();

            System.out.println("Escreva a altura:");
            altura[i] = sc.nextDouble();
        }

        //altura media
        double media = 0;
        for(int i=0; i < altura.length; i++){
            media += altura[i];
        }
        System.out.printf("Media de altura: %.02f" , media/ altura.length);
        System.out.println();

        //porcentagem e nomes de pessoas com menos de 16 anos
        int qtdMenores = 0;
        int totalMenores = 0;
        for(int i=0; i < N; i++){
            if(idade[i] < 16){
                qtdMenores++;
            }

            totalMenores += qtdMenores;
        }

        double percentualMenores = ((double)totalMenores / N) * 100.00;
        System.out.printf("Porcentagem de menores de idade: %.02f" , percentualMenores);
        System.out.println();

        for(int i=0; i < N; i++){
            if (idade[i] < 16) {
                System.out.println("Lista dos nomes da galerinha menor de idade: " + nome[i]);
            }
        }

        sc.close();
    }

}
