package aula12;

import java.util.LinkedList;

public class TesteLinkedList {

    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("a");
        ll.add("b");
        ll.add(1, "c");

        System.out.println(ll);

        ll.remove(1);
        System.out.println(ll);

        ll.remove("a");
        System.out.println(ll);
    }

}
