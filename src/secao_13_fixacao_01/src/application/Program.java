package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many products?");
        int n = sc.nextInt();
        List<Product> list = new ArrayList<>();

        for(int i = 0; i < n; i++){

            System.out.println("Common, used or imported (c/u/i)");
            char opc = sc.next().charAt(0);

            System.out.println("Name:");
            String name = sc.next();
            System.out.println();
            System.out.println("Price:");
            Double price = sc.nextDouble();

            switch (opc){
                case 'c':
                    list.add(new Product(name, price));
                    break;

                case 'u':
                    System.out.print("Manufactured Date (DD/MM/YYYY): ");
                    LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    list.add(new UsedProduct(name, price, date));
                    break;

                case 'i':
                    System.out.println("Customs Fee:");
                    Double customsFee = sc.nextDouble();
                    list.add(new ImportedProduct(name, price, customsFee));
                    break;

                default:
                    System.out.println("Invalid option");
            }

        }

        System.out.println("Price Tags:");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }

        sc.close();

    }

}
