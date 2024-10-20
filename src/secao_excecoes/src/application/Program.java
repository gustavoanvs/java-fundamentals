package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        method1();

        System.out.println("Fim da aplicação");

    }

    public static void method1(){
        System.out.println("*** Começo do Method1 ***");
        method2();
        System.out.println("*** Fim do Method1 ***");
    }

    public static void method2(){
        System.out.println("*** Começo do Method2 ***");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Escreva alguns nomes na lista separado por espaço");
            String[] vect = sc.nextLine().split(" ");

            System.out.println("Qual posição da lista você esta afim de ver?");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posição Inválida");
            e.printStackTrace();
            sc.next();
        }
        catch (InputMismatchException e){
            System.out.println("Inserção errada, digit o numero da posição");
        }
        sc.close();
        System.out.println("*** Fim do Method2 ***");
    }
}
