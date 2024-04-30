package _005_java_courses._01_data_structures_and_algorithms._03_linked_lists._01_singly_l0inked_list;


public class LinkedList {

    Node head;

    /* This function is in LinkedList class. Inserts a
   new Node at front of the list. This method is
   defined inside LinkedList class shown above */

    public void push(int new_data)
    {
        // 1. allocate node
        Node new_node = new Node();

        // 2. put in the data
        new_node.data = new_data;

        // 3. Make next of new node as head
        new_node.next = head;

        // 4. move the head to point
        // to the new node
        head = new_node;
    }

    void printList()
    {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Start with the empty list
        LinkedList list = new LinkedList();

        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        System.out.print(
                "After inserting nodes at their front: ");
        list.printList();

    }

}

class Node {
    int data;
    Node next;
}
