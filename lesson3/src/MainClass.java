import java.util.Scanner;

public class MainClass {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        guessNumber();
    }

    /**
     * //1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки
     * угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число
     * чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз?
     * 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */
    private static void guessNumber() {
        int secretNumber = (int) (Math.random() * 9);
        System.out.println("Давай поиграем, угадайте число от 0 до 9");
        int inputNumber;
        for (int i = 0; i < 3; i++) {
            inputNumber = scanner.nextInt();
            if (inputNumber == secretNumber) {
                printAnswer("Вы угадали! Повторить игру еще раз?/ 1 – да / 0 – нет");
            } else if (i == 2) {
                printAnswer("Вы проиграли! Повторить игру еще раз?/ 1 – да / 0 – нет");
            } else if (inputNumber > secretNumber) {
                System.out.println("Ваше число больше загаданного, введите другое число");
            } else {
                System.out.println("Ваше число меньше загаданного, введите другое число");
            }
        }
    }

    private static void printAnswer(String str) {
        System.out.println(str);
        int answer = scanner.nextInt();
        if (answer == 1) {
            guessNumber();
        } else {
            System.out.println("До свидания!");
        }
    }

}
