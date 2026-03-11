package org.example;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        try {
            fila.enfileirar("Matheus");
            fila.enfileirar("Marcos");
            fila.enfileirar("Lucas");
            fila.enfileirar("João");
            fila.enfileirar("Paulo");
            fila.enfileirar("Felipe");
            fila.enfileirar("Timóteo");
            fila.imprime();
            fila.enfileirar("James");
            fila.enfileirar("Tito");
            System.out.println();
            System.out.println("Desenfileirou: " + fila.desenfileirar());
            System.out.println("Desenfileirou: " + fila.desenfileirar());
            System.out.println("Desenfileirou: " + fila.desenfileirar());
            System.out.println("Desenfileirou: " + fila.desenfileirar());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        fila.imprime();
    }
}