package ex_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

    /*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar. */

    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double valorUnidade, valorTotal;
        String nomeProduto;

        System.out.println("Insira um dos códigos: [1] [2] [3] [4] [5]");
        codigo = sc.nextInt();

        System.out.println("Quantos serão?");
        quantidade = sc.nextInt();

        if(codigo == 1){
            nomeProduto = "Hot Dog";
            valorUnidade = 4.00;
            valorTotal = quantidade * valorUnidade;
            System.out.println("Produto: " + nomeProduto + " \nValor total: " + valorTotal);
        }
        else if(codigo == 2){
            nomeProduto = "X Salada";
            valorUnidade = 4.50;
            valorTotal = quantidade * valorUnidade;
            System.out.println("Produto: " + nomeProduto + " \nValor total: " + valorTotal);
        }
        else if(codigo == 3){
            nomeProduto = "X Bacon";
            valorUnidade = 5.00;
            valorTotal = quantidade * valorUnidade;
            System.out.println("Produto: " + nomeProduto + " \nValor total: " + valorTotal);
        }
        else if(codigo == 4){
            nomeProduto = "Torrada Simples";
            valorUnidade = 2.00;
            valorTotal = quantidade * valorUnidade;
            System.out.println("Produto: " + nomeProduto + " \nValor total: " + valorTotal);
        }
        else if(codigo == 5){
            nomeProduto = "Refrigerante";
            valorUnidade = 1.00;
            valorTotal = quantidade * valorUnidade;
            System.out.println("Produto: " + nomeProduto + " \nValor total: " + valorTotal);
        }
        else{
            System.out.println("Código inserido não corresponde à nenhum produto.");
        }

        sc.close();

    }

}
