package ExerciciosFixacao.Exercicio_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or Company (i/c)? ");
            char ch = sc.next().charAt(0);
            if (ch == 'i') {
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual Income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual Income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                int nameOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, nameOfEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXED PAID:");
        for (TaxPayer taxPayer : list) {
            System.out.printf("%s $ %.2f%n",taxPayer.getName(),taxPayer.tax());
        }

        sc.close();
    }
}
