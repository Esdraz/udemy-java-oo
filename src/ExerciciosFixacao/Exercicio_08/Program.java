package ExerciciosFixacao.Exercicio_08;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Matrix size (Line x Column): ");
        int l = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Inform one matrix valid number: ");
        int x = sc.nextInt();
        System.out.println();

        for (int i = 0; i < ; i++) {

        }





        sc.close();
    }
}
