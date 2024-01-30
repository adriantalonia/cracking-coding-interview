package _004_interview_preparation._03_leetcode._grind75._09_flood_fill;

public class FloodFill {

    public static void main(String[] args) {
        // Example usage
        int[][] image1 = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr1 = 1, sc1 = 1, color1 = 2;

        FloodFill floodFill = new FloodFill();
        int[][] result1 = floodFill.floodFill(image1, sr1, sc1, color1);

        System.out.println("Output 1:");
        printImage(result1);

        int[][] image2 = {{0, 0, 0}, {0, 0, 0}};
        int sr2 = 0, sc2 = 0, color2 = 0;

        int[][] result2 = floodFill.floodFill(image2, sr2, sc2, color2);

        System.out.println("Output 2:");
        printImage(result2);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (oldColor == newColor) {
            // No need to perform flood fill if the new color is the same as the old color
            return image;
        }

        // Perform DFS (Depth First Search) for flood fill
        dfs(image, sr, sc, oldColor, newColor);

        return image;
    }

    private void dfs(int[][] image, int row, int col, int oldColor, int newColor) {
        // Base case: Check if the current position is within the image bounds and has the old color
        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length || image[row][col] != oldColor) {
            return;
        }

        // Change the color of the current pixel
        image[row][col] = newColor;

        // Explore 4-directionally connected pixels
        dfs(image, row + 1, col, oldColor, newColor); // Down
        dfs(image, row - 1, col, oldColor, newColor); // Up
        dfs(image, row, col + 1, oldColor, newColor); // Right
        dfs(image, row, col - 1, oldColor, newColor); // Left
    }

    private static void printImage(int[][] image) {
        for (int[] row : image) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}
