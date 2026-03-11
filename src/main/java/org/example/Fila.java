package org.example;

public class Fila {
    private static class No {
        Object item;
        No proximo;
    }

    private No inicio;
    private No fim;

    // Operações
    public Fila() {
        this.inicio = new No();
        this.fim = this.inicio;
        this.inicio.proximo = null;
    }

    public void enfileirar(Object valor) {
        this.fim.proximo = new No();
        this.fim = this.fim.proximo;
        this.fim.item = valor;
        this.fim.proximo = null;
    }

    public Object desenfileirar() throws Exception {
        Object valor = null;
        if (this.vazia()) {
            throw new Exception("A fila está vazia!");
        }
        this.inicio = this.inicio.proximo;
        valor = this.inicio.item;
        return valor;
    }

    public boolean vazia() {
        return (this.inicio == this.fim);
    }

    public void imprime() {
        No aux;
        aux = this.inicio.proximo;
        while(aux != null) {
            System.out.println(" " + aux.item.toString());
            aux = aux.proximo;
        }
        System.out.println();
    }
}
