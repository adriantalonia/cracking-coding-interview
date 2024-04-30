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

Given a Linked List, the task is to insert a new node in this given Linked List at the following positions:

- At the front of the linked list  
- After a given node.
- At the end of the linked list.

## How to Insert a Node at the Front/Beginning of Linked List

**Approach**:

To insert a node at the start/beginning/front of a Linked List, we need to:

1) Make the first node of Linked List linked to the new node
2) Remove the head from the original first node of Linked List
3) Make the new node as the Head of the Linked List.

![image](https://media.geeksforgeeks.org/wp-content/uploads/20240222162726/Insertion-at-the-Beginning-of-Singly-Linked-List.webp)

```java
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
```

## Complexity Analysis:

- Time Complexity: O(1), We have a pointer to the head and we can directly attach a node and change the pointer. So the Time complexity of inserting a node at the head position is O(1) as it does a constant amount of work.
- Auxiliary Space: O(1)