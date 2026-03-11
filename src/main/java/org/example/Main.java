package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Exemplo 1
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

        // Exemplo 2
        Queue<String> waitingQueue = new LinkedList<>();

        waitingQueue.add("Ana");
        waitingQueue.add("Maria");
        waitingQueue.add("Ester");
        waitingQueue.add("Debora");

        System.out.println("Fila: " + waitingQueue);

        // Verifica se a lista está vazia
        System.out.println("A fila está vazia: " + waitingQueue.isEmpty());

        // Encontra o tamanho da fila
        System.out.println("Tamanho da fila: " + waitingQueue.size());

        // Verifica se a fila contém um determinado elemento
        String name = "Ester";
        if (waitingQueue.contains(name)) {
            System.out.println("Fila contém " + name);
        } else {
            System.out.println("Fila não contém " + name);
        }

        String firstPersonInTheWaitingQueue = waitingQueue.element();
        System.out.println("Primeira pessoa da Fila (element()) : " + firstPersonInTheWaitingQueue);

        firstPersonInTheWaitingQueue = waitingQueue.peek();
        System.out.println("Primeira pessoa da fila: " + firstPersonInTheWaitingQueue);
    }
}