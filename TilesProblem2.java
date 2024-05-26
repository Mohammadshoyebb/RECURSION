/**
 * Problem: Given an n x m board and 1 x m tiles, find the number of ways to tile the board.
 * 
 * Description:
 * - You have a board of size n x m.
 * - You have tiles of size 1 x m.
 * - You need to determine the number of ways to completely cover the board using these tiles.
 * 
 * Constraints:
 * - Each tile can either be placed horizontally (covering 1 row and m columns) or vertically (covering m rows and 1 column).
 * - The board dimensions (n and m) are positive integers.
 */
public class TilesProblem2 {
    
    /**
     * Method to calculate the number of ways to tile an n x m board.
     */
    public static int setTiles(int n, int m) {
        // If the length of the board (n) is equal to the length of the tile (m), there are 2 ways:
        // 1. Place all tiles horizontally
        // 2. Place all tiles vertically
        if (n == m) {
            return 2;
        }
        
        // If the length of the board (n) is less than the length of the tile (m),
        // there is only 1 way to place the tiles, which is horizontally.
        if (n < m) {
            return 1;
        }
        
        // Recursively calculate the number of ways to place tiles:
        // 1. Placing one tile horizontally, reducing the board size to (n-1) x m
        int horizontal = setTiles(n - 1, m);
        
        // 2. Placing m tiles vertically, reducing the board size to (n-m) x m
        int vertical = setTiles(n - m, m);
        
        // Return the total number of ways by summing the two recursive results
        return vertical + horizontal;
    }

    public static void main(String[] args) {
        // Test cases to verify the solution
        System.out.println(setTiles(3, 4)); // Expected output: 1 (Only one way to place 1x4 tile horizontally)
        System.out.println(setTiles(3, 3)); // Expected output: 2 (Two ways: all horizontal or all vertical)
        System.out.println(setTiles(4, 2)); // Expected output: 5 (Different ways to place 1x2 tiles on a 4x2 board)
    }
}
