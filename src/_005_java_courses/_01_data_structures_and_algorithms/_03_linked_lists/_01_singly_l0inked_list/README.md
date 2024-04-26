## Singly Linked List:

Singly Linked List is a type of linked list where each node has two parts: data and next pointer. The data part stores the information and the next pointer points to the next node of the linked list. The next pointer of the last node stores null as it is the last node of the linked list and there is no next node. Traversal of items can be done in the forward direction only due to the linking of every node to its next node.

![image](https://media.geeksforgeeks.org/wp-content/uploads/20240219155344/Singly-Linked-List.webp)

```java
// Singly Linked List Class
class LinkedList {
    Node head; // head of list

    /* Node Class */
    class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
}
```