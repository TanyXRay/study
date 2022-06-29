package study.javarush.practicum.arrays.two_dimension_alarrays;

/**
 * Задача №1 по теме "Многомерные массивы".
 */

public class TwoDimensionalArray3 {

    public static void main(String[] args) {
        int[][] field = new int[5][5];
        int[][] agents = {{1, 4}, {0, 1}, {4, 2}, {4, 3}, {4, 3}, {0, 1}, {0, 2}, {4, 3}};
        int[][] result = pandemic(field, agents);
        print(result);
    }

    public static int[][] pandemic(int[][] field, int[][] agents) {
        for (int[] agent : agents) {
            int x = agent[0];
            int y = agent[1];
            int cellValue = field[x][y];
            if (cellValue == 0) {
                field[x][y] += 1;
            } else {
                field[x][y] *= 2;
            }
        }
        return field;
    }

    public static void print(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            if (i > 0) {
                System.out.print("\n");
            }
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
        }
    }
}




