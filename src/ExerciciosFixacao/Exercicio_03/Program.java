package ExerciciosFixacao.Exercicio_03;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Student name: ");
        student.name = sc.nextLine();

        System.out.println("Inform student grades: ");
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.println("STUDENT: " + student.name);
        System.out.println("FINAL GRADE: " + student.finalGrade());
        if (student.finalGrade() >= 60.0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING " + student.missingPoints() + " POINTS");
        }


        sc.close();
    }
}
