package com.algorithmsPractice.LinkedList;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        //add in first.
        Node newNode = new Node(100);
        newNode.next = head;
        head = newNode;

        //add in between
        Node newNode2 = new Node(200);
        Node temp = head;
        int position = 3;
        int count=1;
        while(temp!=null){
            if(count==position-1){
                newNode2.next = temp.next;
                temp.next = newNode2;
                break;
            }
            temp=temp.next;
            count++;
        }

        Node current = head;
        while(current!=null){
            System.out.print(current.data+"->");
            current = current.next;
        }
        int length = 1;
        Node lengthCounter = head;
        while(lengthCounter.next!=null){
            lengthCounter = lengthCounter.next;
            length++;
        }
        System.out.println();
        System.out.println("Length of the LinkedList is : "+length);

        //search an element
        int element = 70;
        Node search = head;
        while(search!=null){
            if(search.data==element){
                System.out.println("Element is found");
                return;
            }
            search=search.next;
        }
        if(search==null){
            System.out.println("Element is not found");
        }
        //Delte first element
        head = head.next;
        Node current2= head;
        while(current2!=null){
            System.out.print(current2.data+"->");
            current2 = current2.next;
        }
        //delete last
        Node current3= head;
        while(current3!=null){
            if(current3.next.next==null) {
                current3.next = null;
                break;
            }
            current3 = current3.next;
        }


        //Delete from between
        System.out.println("Delete from Between: ");
        Node current5 = head;
        int element3 = 30;
        while(current5.next!=null){
            if(current5.next.data==element3){
             current5.next = current5.next.next;
             break;
            }
            current5 = current5.next;
        }
        Node print = head;
        while (print != null) {
            System.out.print(print.data + " -> ");
            print = print.next;
        }
        System.out.println("null");


    }
}
