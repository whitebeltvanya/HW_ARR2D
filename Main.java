import java.util.Random;

public class Main {

    public static final int SIZE = 8;
    public static final int COLOR_DEPTH = 256;

    public static void main(String[] args) {

        int[][] colors = new int[SIZE][SIZE];
        int[][] rotatedColors = new int[SIZE][SIZE];

        initColors(colors);
        System.out.println("Исходная матрица:\n");
        printMatrix(colors);
        rotate90Clockwise(colors, rotatedColors);
        System.out.println("\nВывод: \n");
        printMatrix(rotatedColors);

    }

    /*
    Формула поворота :
    [j][SIZE-1-i] нового массива = [i][j] старого массива.
     */
    public static void rotate90Clockwise(int[][] base, int[][] rotated) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotated[j][SIZE - 1 - i] = base[i][j];
            }
        }
    }

    public static void initColors(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = random.nextInt(COLOR_DEPTH);
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // %4d означает, что мы под каждый номер резервируем 4 знака
                System.out.format("%4d", matrix[i][j]);
            }
            // Переход на следующую строку
            System.out.println();
        }
    }
}
