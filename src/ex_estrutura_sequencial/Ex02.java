package ex_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

    /*Faça um programa para ler o valor do raio de um círculo,
     e depois mostrar o valor da área deste círculo com quatro
     casas decimais conforme exemplos.
     Fórmula da área: area = π . raio2
     Considere o valor de π = 3.14159*/

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double area, raio;
        double pi = 3.14159;

        raio = sc.nextDouble();
        area = pi * (raio * raio);

        System.out.printf("Area %.4f", area);
        sc.close();
    }
}
