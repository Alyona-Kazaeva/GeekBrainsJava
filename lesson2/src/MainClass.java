import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
        fifthTask();

        int[] array = {3, 4, 7, 11, 12};
        seventhTask(array, 7);

    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0
     */
    static void firstTask() {
        int[] array = {1, 0, 1, 0, 1, 0, 1, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
     */
    static void secondTask() {
        int[] array = new int[8];
        array[0] = 0;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + 3;
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
     */
    static void thirdTask() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами
     */
    static void fourthTask() {
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j || i == array.length - 1 - j) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    /**
     * 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета)
     */
    static void fifthTask() {
        int[] array = {6, 3, 2, 58, 10};
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальный элемент = " + min);
        System.out.println("Максимальный элемент = " + max);
    }

    /**
     * 7. **** Написать метод, которому на вход подается одномерный массив и число n
     * (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций.
     * Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     */
    private static void seventhTask(int[] array, int n) {
        System.out.println(Arrays.toString(array));
        int index = 0;
        int indexSwap;
        int x = -1;
        do {
            indexSwap = (index + n) % array.length;
            if (index > 0) {
                int y = array[indexSwap];
                array[indexSwap] = x;
                x = y;
            } else {
                x = array[indexSwap];
                array[indexSwap] = array[index];
            }
            index = indexSwap;
        } while (index != 0);
        System.out.println(Arrays.toString(array));
    }
}
