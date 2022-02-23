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

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j);

                    if (j - 1 >= 0 && mat[i][j - 1] != 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (j + 1 < c && mat[i][j + 1] != 0) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i - 1 >= 0 && mat[i + 1][j] != 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (i + 1 < l && mat[i + 1][j] != 0) {
                        System.out.println("Bottom: " + mat[i + 1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
