package ex_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo_Switch_Case {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva um numero de 1 à 7 para saber qual dia você esta:");
        int numDay = sc.nextInt();

        switch (numDay){
            case 1:
                System.out.println("Domingou!");
                break;
            case 2:
                System.out.println("Segundou!");
                break;
            case 3:
                System.out.println("Terçou!");
                break;
            case 4:
                System.out.println("Quartou!");
                break;
            case 5:
                System.out.println("Quintou!");
                break;
            case 6:
                System.out.println("Famoso Sextou!");
                break;
            case 7:
                System.out.println("Sabado!");
                break;
            default:
                System.out.println("Não corresponde a nenhum dia, lembre-se de 1 à 7 :)!");
        }

        sc.close();
    }
}
