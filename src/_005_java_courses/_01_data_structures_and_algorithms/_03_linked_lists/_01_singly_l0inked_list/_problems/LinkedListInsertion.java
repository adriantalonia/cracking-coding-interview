package _005_java_courses._01_data_structures_and_algorithms._03_linked_lists._01_singly_l0inked_list._problems;

public class LinkedListInsertion {
}


class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        Node new_node = new Node(x);

        if (head == null) {
            return new_node;
        }

        new_node.next = head;

        return new_node;
    }

    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        Node new_node = new Node(x);

        if(head == null) {
            return new_node;
        }

        new_node.next = null;

        Node last = head;
        while(last.next != null) {
            last = last.next;
        }

        last.next = new_node;
        new_node.next = null;
        return head;
    }
}