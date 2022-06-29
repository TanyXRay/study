package study.javarush.practicum.arrays.two_dimension_alarrays;

import java.util.Scanner;

/**
 * Работа с многомерными массивами.
 * Практическая игра в "крестики - нолики".
 */

public class TwoDimensionalArray2 {
    public static final int SIZE = 3;
    public static final int EMPTY = '-';
    public static final char CROSS = 'x';
    public static final char ZERO = 'o';

    public static void main(String[] args) {
        char[][] field = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = EMPTY;
            }
        }

        Scanner scanner = new Scanner(System.in);
        boolean isCrossTurn = true;

        while (true) {
            System.out.println("Ходят " + (isCrossTurn ? "крестики" : "нолики") + "!");
            printField(field);
            String input = scanner.nextLine(); // '1 2'
            String[] parts = input.split(" ");
            int x = Integer.parseInt(parts[0]) - 1;
            int y = Integer.parseInt(parts[1]) - 1;
            if (field[x][y] != EMPTY) {
                continue;
            }
            field[x][y] = isCrossTurn ? CROSS : ZERO;

            if (isWin(field, isCrossTurn ? CROSS : ZERO)) {
                System.out.println("Выиграли " + (isCrossTurn ? "крестики" : "нолики") + "!");
                printField(field);
                break;
            } else {
                if (isCrossTurn) {
                    isCrossTurn = false;
                } else {
                    isCrossTurn = true;
                }
                // isCrossTurn = !isCrossTurn;
            }
        }
    }

    // Внимание! Только для размера 3х3
    public static boolean isWin(char[][] field, char player) {
        if (field[0][0] == CROSS && field[0][1] == CROSS && field[0][2] == CROSS) {
            return true;
        }
        if (field[1][0] == CROSS && field[1][1] == CROSS && field[1][2] == CROSS) {
            return true;
        }
        if (field[2][0] == CROSS && field[2][1] == CROSS && field[2][2] == CROSS) {
            return true;
        }

        if (field[0][0] == CROSS && field[1][0] == CROSS && field[2][0] == CROSS) {
            return true;
        }
        if (field[0][1] == CROSS && field[1][1] == CROSS && field[2][1] == CROSS) {
            return true;
        }
        if (field[0][2] == CROSS && field[1][2] == CROSS && field[2][2] == CROSS) {
            return true;
        }

        if (field[0][0] == CROSS && field[1][1] == CROSS && field[2][2] == CROSS) {
            return true;
        }
        if (field[2][0] == CROSS && field[1][1] == CROSS && field[0][2] == CROSS) {
            return true;
        }

        return false;
    }

    public static void printField(char[][] field) {
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
