package ex_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    /*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
    hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais*/

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numFunc;
        double horasTrabalhadas, valorPorHora,salario;

        numFunc = sc.nextInt();
        horasTrabalhadas = sc.nextDouble();
        valorPorHora = sc.nextDouble();

        salario = horasTrabalhadas * valorPorHora;

        System.out.println("Number = " + numFunc);
        System.out.printf("Salary = U$ %.2f", salario);

        sc.close();

    }

}
