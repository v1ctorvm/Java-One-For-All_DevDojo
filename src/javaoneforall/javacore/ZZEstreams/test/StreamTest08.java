package javaoneforall.javacore.ZZEstreams.test;


import javaoneforall.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

// Reduce with objects
public class StreamTest08 {

    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 10.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game no Life", 2.99),
            new LightNovel("Fullmetal Alchemist", 6.99),
            new LightNovel("Kumo desugat", 1.99),
            new LightNovel("Kumo desugat", 1.99),
            new LightNovel("Monogatari", 4.0)
    ));

    static void main() {
        // somar todos os precos de light novel quando o preco for maior que 3

        lightNovelList.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum).ifPresent(System.out::println);


        // Se tiver muitos numeros, pode causar lentidao
        // O Stream normal, faz a conversao para Double
        // Esse metodo, j'a utiliza DoubleStream
        double sum = lightNovelList.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();

        System.out.println("sum = " + sum);


    }
}
