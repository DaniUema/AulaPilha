    package com.example.aulapilha20.pilha;
    import java.awt.*;
    import java.util.ArrayList;
    public class Pilha <pratos> {

        /*public - private - protected*/
        int quantidadeItens;
        private Object[] pratos;

        // Fazer metodo empilha
        // Fazer metodo desempilha
        // metodo verifica a quantidade de pratos

        public Pilha(int capacidade)
        {
            this.pratos = new Object[capacidade];
            this.quantidadeItens = 0;
        }

        public void Empilhar(Object elemento)
        {
            if(quantidadeItens >=pratos.length)
            {
                System.out.println("A pilha de pratos está cheia, não é possível adicionar mais.");
                return;
            }
            pratos[quantidadeItens] = elemento;
            quantidadeItens++;
        }

        public Object Desempilhar()
        {
            if (quantidadeItens==0)
            {
                System.out.println("A pilha está vazia, não há pratos para remover.");
                 return null;
            }
            Object elemento = pratos[quantidadeItens-1];
            pratos[quantidadeItens-1] = null;
            quantidadeItens--;
            return elemento;
        }
        public int getQuantidadeItens()
        {
            return quantidadeItens;
        }
        public void mostrarPilha()
        {
            for (int i = 0; i < quantidadeItens; i++){
                System.out.println(pratos[i]+"");
            }
        }



    }

       /* public int getQuantidadeItens()
        {
            return quantidadeItens;
        }

        public void setQuantidadeItens(int quantidadeItens)
        {
            this.quantidadeItens = quantidadeItens;
        }

        public Object[] getPratos()
        {
            return pratos;
        }

        public void setPratos(Object[] pratos)
        {
            this.pratos = pratos;
        }
    */
