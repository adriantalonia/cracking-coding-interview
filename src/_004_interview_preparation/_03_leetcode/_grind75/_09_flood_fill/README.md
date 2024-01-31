# Flood Fill

An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.

You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].

To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with color.

Return the modified image after performing the flood fill.

![image](https://assets.leetcode.com/uploads/2021/06/01/flood1-grid.jpg)

Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
Output: [[2,2,2],[2,2,0],[2,0,1]]
Explanation: From the center of the image with position (sr, sc) = (1, 1) (i.e., the red pixel), all pixels connected by a path of the same color as the starting pixel (i.e., the blue pixels) are colored with the new color.
Note the bottom corner is not colored 2, because it is not 4-directionally connected to the starting pixel.
Example 2:

Input: image = [[0,0,0],[0,0,0]], sr = 0, sc = 0, color = 0
Output: [[0,0,0],[0,0,0]]
Explanation: The starting pixel is already colored 0, so no changes are made to the image.


Constraints:

m == image.length
n == image[i].length
1 <= m, n <= 50
0 <= image[i][j], color < 216
0 <= sr < m
0 <= sc < n

# Intuition
The problem requires performing a flood fill on a 2D grid starting from a given pixel and changing the color of connected pixels with the same color. The intuition is to use a depth-first search (DFS) approach to traverse the connected pixels and change their color.

# Approach
The approach involves checking if the new color is the same as the old color; if they are the same, there is no need to perform a flood fill. Otherwise, initiate the DFS algorithm to traverse the connected pixels.

1) In the floodFill function, check if the old color is equal to the new color. If true, return the original image as there is no need to change anything.

2) Call the dfs function to perform the flood fill. The dfs function takes the current position (row, col), old color, and new color as parameters.

3) In the dfs function, implement a base case to check if the current position is within the image bounds and has the old color. If any of these conditions are not met, return from the function.

4) Change the color of the current pixel to the new color.

5) Recursively call the dfs function for the 4-directionally connected pixels: down, up, right, and left.

6) The DFS algorithm will continue until it explores all connected pixels with the same old color.

# Complexity
- Time complexity: O(m * n), where m is the number of rows and n is the number of columns in the image. In the worst case, the DFS algorithm may visit all pixels in the image.

- Space complexity: O(m * n), where m is the number of rows and n is the number of columns in the image. The space complexity is determined by the depth of the recursive DFS calls, and in the worst case, it can be the entire image.





