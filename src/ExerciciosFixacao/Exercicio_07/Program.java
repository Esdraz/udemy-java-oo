package ExerciciosFixacao.Exercicio_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Employee #" + (i + 1));
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            System.out.println();

            employees.add(new Employee(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        Integer id = sc.nextInt();
        Boolean valid = false;

        for (Employee x : employees) {
            if (x.getId().equals(id)) {
                System.out.print("Enter the percentage: ");
                Double percentage = sc.nextDouble();
                x.increaseSalary(percentage);
                valid = true;
            }
        }

        if (valid == false) {
            System.out.println("This id does not exist!\n");
        }

        System.out.println("List of employees:");
        for (Employee x : employees) {
            System.out.println(x);
        }

        sc.close();
    }
}
