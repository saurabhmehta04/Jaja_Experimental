package com.basics;


import java.util.LinkedList;

/**
 * Created by Falcon on 11/2/15.
 */
public class linkedList {


    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Item1");
        ll.add("Item2");
        ll.add("Item3");
        ll.add("Item4");
        ll.add("Item5");
        ll.add("Item6");

        System.out.println("LinkedList content: " + ll);

//        Adding first and last element in the linked list
        ll.addFirst("Item0");
        ll.addLast("Item7");

        System.out.println(ll);

//        get
        Object test = ll.get(0);
        System.out.println(test);

//        set
        ll.set(0, "Item1");
        System.out.println(ll);

        System.out.println("Before deletion : " + ll);

//        Remove first
        ll.removeFirst();
        System.out.println("Removed first : " + ll);

//        Remove last
        ll.removeLast();
        System.out.println("Removed last : " + ll);

//        remove from an index
        ll.remove(2);
        System.out.println(ll);


//        Add to a position
        ll.add(2, "<Item3>");
        System.out.println("Addition : " + ll);


//        return and remove an element
        Object o = ll.pollFirst();   //also pollLast(), poll(int index)
        System.out.println("Poll result: " + o);
        System.out.println("After polling : " + ll);

//        set at index  / update
        ll.set(1, "Item3");
        System.out.println("After setting: " + ll);

//        return the size
        System.out.println(ll.size());












    }

}
