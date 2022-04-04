package Topicos.DateCalendar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Informe uma data: ");
        String date = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateFormatado = String.format(date, formatter);

        System.out.println(dateFormatado);


/*
        LocalDate hoje = LocalDate.now();

        System.out.println("Sem formatar: " + hoje);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String hojeFormatado = hoje.format(formatter);

        System.out.println("Formatado: " + hojeFormatado);*/

        sc.close();
    }
}
