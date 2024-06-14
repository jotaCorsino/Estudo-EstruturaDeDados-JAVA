package org.example;

import DadaSctucture.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList("Elemento 1");
        list.append("Elemento 2");
        list.append("Elemento 3");
        list.prepend("Elemento 0");

        //list.insert(3, "Elemento 2,5");
        //list.set(1, "Elemento 0,5");
        //System.out.println(list.get(2).data);
        //System.out.println("Remove first: " + list.removeFirst().data);
        //System.out.println("Remove last: " + list.removeLast().data);
        //list.remove(2);
        //list.getHead();
        //list.getTail();
        //list.getLength();
        list.print();

    }
}