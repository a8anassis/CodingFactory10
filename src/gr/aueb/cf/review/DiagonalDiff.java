package gr.aueb.cf.review;

/**
 *
 */
public class DiagonalDiff {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 14, 15},
                {2, 1, 8},
                {3, 3, 1}
        };

        System.out.println(diagonalDiff(arr));
    }

    public static int diagonalDiff(int[][] arr) {
        int diagonalA = 0;  // left to right
        int diagonalB = 0;  // right to left
        int diff = 0;

        for (int i = 0; i < arr.length; i++) {
            diagonalA += arr[i][i];
            diagonalB += arr[i][arr[i].length - 1 - i];
        }

        return Math.abs(diagonalA - diagonalB);
    }
}
