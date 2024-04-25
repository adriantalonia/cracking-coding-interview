# Linked List

- Linked List is a linear data structure, in which elements are not stored at a contiguous location, rather they are linked using pointers. Linked List forms a series of connected nodes, where each node stores the data and the address of the next node.

![image](https://media.geeksforgeeks.org/wp-content/uploads/20220712172013/Singlelinkedlist.png)

- **Node Structure:** A node in a linked list typically consists of two components:
- **Data:** It holds the actual value or data associated with the node.
- **Next Pointer:** It stores the memory address (reference) of the next node in the sequence.
- **Head and Tail:** The linked list is accessed through the head node, which points to the first node in the list. The last node in the list points to NULL or nullptr, indicating the end of the list. This node is known as the tail node.


### Characteristics of a Singly Linked List:
- Each node holds a single value and a reference to the next node in the list.
- The list has a head, which is a reference to the first node in the list, and a tail, which is a reference to the last node in the list.
- The nodes are not stored in a contiguous block of memory, but instead, each node holds the address of the next node in the list.
- Accessing elements in a singly linked list requires traversing the list from the head to the desired node, as there is no direct access to a specific node in memory.

### Types of linked lists:
There are mainly three types of linked lists:

1) Single-linked list
2) Double linked list
3) Circular linked list

## 1. Single-linked list:

In a singly linked list, each node contains a reference to the next node in the sequence. Traversing a singly linked list is done in a forward direction.
![image](https://media.geeksforgeeks.org/wp-content/uploads/20220712172013/Singlelinkedlist.png)

## 2. Double-linked list:

In a doubly linked list, each node contains references to both the next and previous nodes. This allows for traversal in both forward and backward directions, but it requires additional memory for the backward reference.

![image](https://media.geeksforgeeks.org/wp-content/uploads/20220712180755/Doublylinkedlist.png)

## 3. Circular linked list:

In a circular linked list, the last node points back to the head node, creating a circular structure. It can be either singly or doubly linked

![image](https://media.geeksforgeeks.org/wp-content/uploads/20220712181336/Circularlinkedlist.png)

## Operations on Linked Lists
1) **Insertion**: Adding a new node to a linked list involves adjusting the pointers of the existing nodes to maintain the proper sequence. Insertion can be performed at the beginning, end, or any position within the list
2) **Deletion**: Removing a node from a linked list requires adjusting the pointers of the neighboring nodes to bridge the gap left by the deleted node. Deletion can be performed at the beginning, end, or any position within the list.
3) **Searching**: Searching for a specific value in a linked list involves traversing the list from the head node until the value is found or the end of the list is reached.

## Complexity Analysis of Linked List:
- Time Complexity: O(n)
- Auxiliary Space: O(n)

## Advantages of Linked Lists
- **Dynamic Size**: Linked lists can grow or shrink dynamically, as memory allocation is done at runtime.
- **Insertion and Deletion**: Adding or removing elements from a linked list is efficient, especially for large lists.
- **Flexibility**: Linked lists can be easily reorganized and modified without requiring a contiguous block of memory.
## Disadvantages of Linked Lists
- **Random Access**: Unlike arrays, linked lists do not allow direct access to elements by index. Traversal is required to reach a specific node.
- **Extra Memory**: Linked lists require additional memory for storing the pointers, compared to arrays.

## Conclusion:
Linked lists are versatile data structures that provide dynamic memory allocation and efficient insertion and deletion operations. 

Understanding the basics of linked lists is essential for any programmer or computer science enthusiast. With this knowledge, you can implement linked lists to solve various problems and expand your understanding of data structures and algorithms.