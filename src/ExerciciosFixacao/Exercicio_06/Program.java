package ExerciciosFixacao.Exercicio_06;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            System.out.println();

            vect[room] = new Rent(name, email);
        }

        // verifica as posições não nulas do vetor para imprimir na tela
        System.out.println("\nBusy Rooms:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }






        sc.close();
    }
}
