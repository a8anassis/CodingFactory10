package gr.aueb.cf.solutions.projects;

import java.util.Scanner;

/**
 * Παιχνίδι τρίλιζας για 2 παίκτες.
 * Ο χρήστης δίνει γραμμή και στήλη (1-3) σε ένα prompt.
 *
 * @author thanos
 */
public class TicTacToe {
    private static final int SIZE = 3;
    private static final int TOTAL_MOVES = SIZE * SIZE;
    private static final int EMPTY = 0;
    private static final int[][] grid = new int[SIZE][SIZE];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moveCount = 0;
        int player = 0;
        int row = 0;
        int column = 0;

        while (true) {
            player = (moveCount % 2 == 0) ? 1 : 2;

            printGrid();

            System.out.printf("Παίκτης %d, δώσε γραμμή και στήλη (π.χ. 1 2): %n", player);

            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Μη έγκυρη είσοδος. Δώσε ακέραιο:");
            }
            row = scanner.nextInt();

            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Δώσε και τη στήλη:");
            }
            column = scanner.nextInt();

            if (!isValidRow(row) || !isValidColumn(column)) {
                System.out.printf("Μη έγκυρες τιμές. Επιτρεπτές τιμές: 1-%d.%n", SIZE);
                continue;
            }

            // Μετατροπή από 1-based (user) σε 0-based (array)
            if (!placeMove(player, row - 1, column - 1)) {
                System.out.println("Το κελί είναι ήδη κατειλημμένο. Ξαναπαίξε.");
                continue;
            }

            moveCount++;

            if (isWin(player)) {
                printGrid();
                System.out.printf("Παίκτης %d κερδίζει!%n", player);
                break;
            }

            if (moveCount == TOTAL_MOVES) {
                printGrid();
                System.out.println("Ισοπαλία!");
                break;
            }
        }

        scanner.close();
    }

    public static boolean isValidRow(int row) {
        return row >= 1 && row <= SIZE;
    }

    public static boolean isValidColumn(int column) {
        return column >= 1 && column <= SIZE;
    }

    /**
     * Τοποθετεί την κίνηση του παίκτη στο κελί. Δέχεται 0-based συντεταγμένες.
     *
     * @return true αν η κίνηση έγινε, false αν το κελί ήταν κατειλημμένο
     */
    public static boolean placeMove(int player, int row, int column) {
        if (grid[row][column] != EMPTY) return false;
        grid[row][column] = player;
        return true;
    }

    public static boolean isWin(int player) {
        return isRowWin(player)
                || isColumnWin(player)
                || isMainDiagonalWin(player)
                || isAntiDiagonalWin(player);
    }

    public static boolean isRowWin(int player) {
        for (int i = 0; i < SIZE; i++) {
            boolean rowWin = true;
            for (int j = 0; j < SIZE; j++) {
                if (grid[i][j] != player) {
                    rowWin = false;
                    break;
                }
            }
            if (rowWin) return true;
        }
        return false;
    }

    public static boolean isColumnWin(int player) {
        for (int j = 0; j < SIZE; j++) {
            boolean colWin = true;
            for (int i = 0; i < SIZE; i++) {
                if (grid[i][j] != player) {
                    colWin = false;
                    break;
                }
            }
            if (colWin) return true;
        }
        return false;
    }

    public static boolean isMainDiagonalWin(int player) {
        for (int i = 0; i < SIZE; i++) {
            if (grid[i][i] != player) return false;
        }
        return true;
    }

    public static boolean isAntiDiagonalWin(int player) {
        for (int i = 0; i < SIZE; i++) {
            if (grid[i][SIZE - 1 - i] != player) return false;
        }
        return true;
    }

    public static void printGrid() {
        System.out.println();
        System.out.print("   ");
        for (int j = 1; j <= SIZE; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + "  ");
            for (int j = 0; j < SIZE; j++) {
                char symbol = switch (grid[i][j]) {
                    case 1 -> 'X';
                    case 2 -> 'O';
                    default -> '.';
                };
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}