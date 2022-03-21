package com.p128.d5_collectionlist;

import java.util.LinkedList;

public class ListDemo03 {
    public static void main(String[] args) {
        LinkedList<String > stack =new LinkedList<>();

        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        System.out.println(stack);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.getFirst());


        LinkedList<String > queue =new LinkedList<>();
        queue.offerLast("1");
        queue.addLast("2");
        queue.addLast("3");
        queue.addLast("4");

        System.out.println(queue);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue);
    }
}
