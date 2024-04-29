package _005_java_courses._01_data_structures_and_algorithms._03_linked_lists._01_singly_l0inked_list;


public class LinkedList {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            data = data;
            next = null;
        }
    }

    /* This function is in LinkedList class. Inserts a
   new Node at front of the list. This method is
   defined inside LinkedList class shown above */

    public void push(int new_data)
    {
    /* 1 & 2: Allocate the Node &
              Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

}
