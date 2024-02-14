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

# Big O Rules

## Best case

The best case refers to the scenario in which an algorithm performs with the minimum possible time or space complexity for a given problem.

```java
public int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i;
        }
    }
    return -1;
}
```

In the above function, the best scenario is when the element being searched for is found at the very beginning of the array. In this case, the algorithm would only need to perform a single comparison, resulting in a time complexity of O(1).

## Average case
The average case refers to the expected or typical performance of an algorithm when considering inputs of varying sizes and distributions.

```java
public int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i;
        }
    }
    return -1;
}
```

In the above function, the element being searched for can be located randomly within the range of 0 to arr’s length (excluding the endpoint).

## Worst case
The worst case refers to the scenario in which an algorithm exhibits the maximum time or space complexity for a given problem. It represents the most unfavorable inputs and conditions.

```java
public int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i;
        }
    }
    return -1;
}
```
In the above function, the element being searched for is found at the end of the array. In this case, the algorithm would need to iterate through the whole array to find the element, resulting in a time complexity of O(n).

## Removing Constants

When analyzing the time and space complexity of an algorithm, we can simplify the expressions by disregarding constant factors. Let’s consider the example below.

```java
int maxVal = Integer.MIN_VALUE;
for (int i = 0; i < array.length; i++) { // n = array.length
    if (maxVal < array[i]) { // O(1)
        maxVal = array[i]; // O(1)
    }
}
```
Sum up the complexity of the above snippet.

```
Compelxity = n x (O(1) + O(1))
           = n x O(2) = O(2n) = O(n)
```

## Dropping Non-Dominants

In Big O notation, the dominant term is the one that grows the fastest as the input size increases. The non-dominant term has a lesser impact on the overall complexity.

Dropping non-dominant terms involves focusing only on the dominant terms and disregarding the non-dominant terms.

```
O(n² + n + 1) = O(n²) // dropping the non-dominant terms
```
In the example above, the constant term 1 and the term n are disregarded since they do not significantly affect the growth rate compared to the quadratic term **n²**.

However, when dealing with a complexity that involves multiple variables, reducing it to a simpler form is not straightforward. For instance, in the case of the time complexity expressed as O(n² + m), it’s not possible to simplify it further without specific knowledge about the values of n and m.

![image](https://miro.medium.com/v2/resize:fit:720/format:webp/1*FCBQEMtfGZEJX1-ly4R1FA.png)


