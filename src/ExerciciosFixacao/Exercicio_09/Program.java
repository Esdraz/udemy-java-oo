package ExerciciosFixacao.Exercicio_09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(birthDate);

        Client client = new Client(name, email, date);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.nextLine();

        Order order = new Order(OrderStatus.valueOf(status), client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Enter #" + (i + 1) + " item data: ");
            Product product = new Product();

            System.out.print("Product name: ");
            product.setName(sc.nextLine());
            System.out.print("Product price: ");
            product.setPrice(sc.nextDouble());
            System.out.print("Quantity: ");
            int pQuantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(pQuantity, product);
            order.addItem(orderItem);

        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
