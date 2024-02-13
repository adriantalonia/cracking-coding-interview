# A Simple Explanation of Big O Notation

### Time complexity
Time complexity measures the runtime of an algorithm by estimating the number of operations it requires to complete. It is a crucial metric for analyzing scalability, efficiency, and making comparisons between algorithms solving the same problem.

Consider an example where we need to calculate the sum of all elements in an array of size n. By iterating through each element in the array and performing a constant-time addition operation, we require n operations to complete the calculation.

### Space complexity
Space complexity measures the memory consumed by an algorithm. Analyzing it evaluates efficiency, resource needs, and enables comparisons between different approaches to problem-solving.

Several factors contribute to the space complexity:

- Variables
- Data Structures
- Recursive Calls
- Input Size
- Algorithmic Design

Consider an example where we reverse a string using a stack data structure. Each character is pushed onto the stack and then popped to build the reversed string. The stack requires space to store the characters during the reversal process.

# What is Big O?

Big O notation is a way to represent the scalability and efficiency of an algorithm by providing an approximation of how the algorithm’s time or space requirements grow relative to the size of the input.

For instance, let’s consider the linear search algorithm as an example. In this algorithm, we sequentially check each element in an array until we find a match. As the size of the array increases, the execution time will scale linearly, as we need to examine each element in the worst-case scenario.

![image](https://miro.medium.com/v2/resize:fit:640/format:webp/1*jcZkluLOQXsc9lelQyPonw.png)

To understand the complexity of an algorithm, we can examine its code and identify the factors that contribute to its time or space requirements.

```java
public int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) { // O(n)
        if (arr[i] == target) {  // O(1)
            return i;  // O(1)
        }
    }
    return -1;
}
```

In the case of the linear search algorithm, the code snippet iterates through each element in the array, resulting in a time complexity of ***O(n)***, where “n” represents the size of the array.