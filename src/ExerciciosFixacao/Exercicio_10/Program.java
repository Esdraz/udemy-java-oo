package ExerciciosFixacao.Exercicio_10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (ch == 'c') {
                list.add(new Product(name, price));
            }
            if (ch == 'u') {
                sc.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manufactureDate = sc.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                LocalDate date = LocalDate.parse(manufactureDate, formatter);
                String manufactureFormattedDate = date.format(formatter);


                list.add(new UsedProduct(name, price, date));
            }
            if (ch == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product product: list) {
            System.out.println(product.priceTag());
        }


        sc.close();
    }
}
