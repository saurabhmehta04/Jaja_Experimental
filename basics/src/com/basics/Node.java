package com.basics;

/**
 * Created by Falcon on 11/2/15.
 */
public class Node {

    private String data;
    private Node next;


    public Node(String data, Node next) {  // sort of recursive data structure
//        Node contains two thing
//        data value and next node
        this.data = data;
        this.next = next;

    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public static String getThird(Node list) {
        return list.getNext().getNext().getData();
    }

    public static void insertSecond(Node list, String s) {
//        Node newNode = new Node(s, list.getNext()); // created a new node pointing to the next correct node
//        list.setNext(newNode);

        list.setNext(new Node(s, list.getNext()));

    }

    public static int size(Node list) {
//        of course we need counter

        int count = 0;
        while (list != null) { //will work even if the list is null
            count++;
            list = list.getNext();  // list is the local variable and hence it does not destroy the linked list.
        }
        return count;
    }

//    returns the resulting list
    public static Node addLast(Node list, String s) {

        if (list == null) {
            return new Node(s, null);
        }
        Node temp = list;

        while (list.getNext() != null) {
            temp = list.getNext();
        }

        temp.setNext(new Node("s", null)); //if the node is null, nullpointerexception

        return list;

    }




    public static void main(String[] args) {
//        Node cNode = new Node("C", null); // since this is the last node, creating this first
//        Node bNode = new Node("B", cNode);
//        Node list = new Node("A", bNode);
        Node list = new Node("A", new Node("B", new Node("C", null))); //c is created first, then b and then a

        Node list1 = null;  // empty linked list



    }


}
