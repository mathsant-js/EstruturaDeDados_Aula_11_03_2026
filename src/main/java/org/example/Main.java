package org.example;

import java.util.Iterator;
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

        // Exemplo 3
        Queue<String> fila_de_espera = new LinkedList<>();

        //enfileira
        fila_de_espera.add("Elias");
        fila_de_espera.add("Eliseu");
        fila_de_espera.add("Samuel");
        fila_de_espera.add("Davi");

        System.out.println("=== Iterações em uma Fila usando Java8 forEach() "
                + "===");
        fila_de_espera.forEach(name3 -> {
            System.out.println(name3);
        });

        System.out.println("\n=== Iteraçoes em uma Fila usando iterator() ===");
        Iterator<String> fila_de_esperaIterator = fila_de_espera.iterator();
        while (fila_de_esperaIterator.hasNext()) {
            String name3 = fila_de_esperaIterator.next();
            System.out.println(name);
        }

        System.out.println("\n=== Iterações em uma Fila usando iterator() e "
                + "Java8 forEachRemaining() ===");
        fila_de_esperaIterator = fila_de_espera.iterator();
        fila_de_esperaIterator.forEachRemaining(name3 -> {
            System.out.println(name);
        });

        System.out.println("\n=== Iterações sobre uma Fila usando loop for-each ===");
        for (String name3 : fila_de_espera) {
            System.out.println(name);
        }

        // Exemplo 4
        Queue<Integer> fila4 = new LinkedList<>();

        // Adiciona os elementos {0, 1, 2, 3, 4} na fila
        for (int i = 0; i < 5; i++)
            fila4.add(i);

        // Mostra o conteúdo da fila.
        System.out.println("Elementos da Fila: " + fila);

        // Remover o cabeça da fila
        int elemento_removido = fila4.remove();
        System.out.println("Elemento Removido: " + elemento_removido);

        System.out.println(fila);

        // Visualizar o cabeça da fila
        int head = fila4.peek();
        System.out.println("Cabeça da Fila: " + head);

        // Todos os demais métodos da Interface Collection,
        // tais como size e contains podem ser usados com esta implementação.
        int tamanho = fila4.size();
        System.out.println("Tamanho da Fila: " + tamanho);

    }
}