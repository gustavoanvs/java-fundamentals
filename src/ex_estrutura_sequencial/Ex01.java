package ex_estrutura_sequencial;
import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    /*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
    mensagem explicativa */

    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x,y,soma;
        x = sc.nextInt();
        y = sc.nextInt();

        soma = x + y;

        System.out.println("Soma = " + soma);

        sc.close();
    }
}
