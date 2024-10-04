package ex_POO;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        double area = rect.area();
        double perimetro = rect.perimetro();
        double diagonal = rect.diagonal();

        System.out.println("Area = " + area +
                           "\nPerimetro = " + perimetro +
                           "\nDiagonal = " + diagonal);

    }

}

