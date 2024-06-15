package org.example;

import DataStructure.Tree;
import DataStructure.LinkedList;
import DataStructure.Queue;
import DataStructure.Stack;

public class Main
{
    public static void main(String[] args)
    {
        /* // Estudos LISTA =========================================
        LinkedList list = new LinkedList("Elemento 1");
        list.append("Elemento 2");
        list.append("Elemento 3");
        list.prepend("Elemento 0");
        list.insert(3, "Elemento 2,5");
        list.set(1, "Elemento 0,5");
        System.out.println(list.get(2).data);
        System.out.println("Remove first: " + list.removeFirst().data);
        System.out.println("Remove last: " + list.removeLast().data);
        list.remove(2);
        list.getHead();
        list.getTail();
        list.getLength();
        list.print(); */

        /* // Estudos PILHA =========================================
        Stack myStack = new Stack(2);
        myStack.push(1);
        System.out.println("Removidos: " + myStack.pop().value);
        System.out.println("Removidos: " + myStack.pop().value);
        myStack.print();
        myStack.getTop();
        myStack.getHeight();
        // inverter ordem da pilha <<
        int[] numeros = {5, 4, 3, 2, 1};
        Stack.inverter(numeros); */

        // Estudos Filas =========================================
        /* Queue myQueue = new Queue(1);
        myQueue.getFirts();
        myQueue.getLast();
        myQueue.getLength();
        myQueue.print();
        //enfileirar
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.getFirts();
        myQueue.getLast();
        myQueue.getLength();
        myQueue.print();
        // desenfileirar
        System.out.println("Removido: " + myQueue.dequeue().value);
        myQueue.getFirts();
        myQueue.getLast();
        myQueue.getLength();
        myQueue.print(); */

        // Estudo Arvores =========================================
        Tree tree = new Tree();
        tree.insert(37);
        tree.insert(11);
        tree.insert(66);
        tree.insert(8);
        tree.insert(17);
        tree.insert(42);
        tree.insert(72);

        System.out.println("############");
        // tree.preOrder(); // PREORDER
        // tree.inOrder();  // INORDER
        //tree.posOrder(); // POSORDER
        tree.BFS(); //BUSCA EM LARGURA
        System.out.println("############");

        //System.out.println(tree.root.value);
        //System.out.println(tree.root.left.value);
        //System.out.println(tree.root.right.value);
        //System.out.println(tree.root.isLeaf());
        //System.out.println(tree.root.left.isLeaf()); */
    }
}