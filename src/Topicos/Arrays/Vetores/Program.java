package Topicos.Arrays.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Inform vector size: ");
        int n = sc.nextInt(); //ler o valor do n.

        System.out.println("inform vector data:");
        double[] vect = new double[n]; //[] = declaração do vetor, [n] = tamanho do vetor

        //ler o vetor
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.printf("AVERAGE HEIGHT: %.2f", avg);

        sc.close();
    }
}
