package org.example;
import DataStructure.Queue;
import java.util.Random;

public class FilaDeAtendimento {

    public static void main(String[] args) {

        int numeroDeClientes = 5;
        var random = new Random();
        int cliente = random.nextInt(101);
        Queue queue = new Queue(cliente);
        System.out.println("Chegou o cliente: " + cliente);

        //simula a chegada dos clientes
        for (int i = 2; i <= numeroDeClientes; i++)
        {
            cliente = random.nextInt(101);
            System.out.println("Chegou o cliente: " + cliente);
            queue.enqueue(cliente);
        }

        //atendimento
        var node = queue.dequeue();
        while (node != null)
        {
            System.out.println("O cliente " + node.getValue() + " foi atendido.");
            node = queue.dequeue();
        }

    }
}
