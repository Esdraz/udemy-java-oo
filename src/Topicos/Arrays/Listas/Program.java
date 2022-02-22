package Topicos.Arrays.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria"); //pos 0
        list.add("Alex"); //pos 1
        list.add("Bob"); //pos 2
        list.add("Anna"); //pos 3
        list.add(2, "Marco"); // adiciona o Marco na posição 2 da lista

        System.out.println("Tamanho da lista: " + list.size()); // mostra tamanho da lista
        System.out.println("===============================");

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------------------");

//        list.remove("Anna"); // remove comparando com a lista
//        list.remove(1); // remove da pos 1
        list.removeIf(x -> x.charAt(0) == 'M'); // remoção por predicado usando expressão lambda

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob")); // mostra a posição do valor na lista
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("-------------------------------");
        // filtar os nomes que começam com "A" e mostrar o resultado em uma nova lista chamada "result"
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //converte pra stream, faz a operação lambda e converte novamente pra lista

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("-------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // pega o primeiro elemento que começa com A, caso não exista retorna nulo
        System.out.println(name);
    }
}
