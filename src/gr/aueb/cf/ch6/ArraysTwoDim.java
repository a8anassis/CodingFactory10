package gr.aueb.cf.ch6;

/**
 * Ορίζει ένα 2D array και το κάνει
 * populate. Arrays οριζονται ως [γραμμή][στήλη]
 */
public class ArraysTwoDim {

    public static void main(String[] args) {
        int[][] grid = new int[2][3];

        int[][] grid2 = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        grid[0][0] = 5;
        grid[0][1] = 10;
        grid[0][2] = 20;
        grid[1][0] = 15;
        grid[1][1] = 20;
        grid[1][2] = 25;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] row : grid) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}
