import java.util.Scanner;

public class MainClass {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        guessNumber();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        guessWord(words);
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

    /**
     * 2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
     * "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
     * "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
     * При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
     * сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано,
     * компьютер показывает буквы которые стоят на своих местах.
     * apple – загаданное
     * apricot - ответ игрока
     * ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
     * Для сравнения двух слов посимвольно, можно пользоваться:
     * String str = "apple";
     * str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
     * Играем до тех пор, пока игрок не отгадает слово
     * Используем только маленькие буквы
     * @param words, массив слов для угадывания
     */
    private static void guessWord(String[] words) {
        int randomIndex = (int) (Math.random() * words.length);
        String findWord = words[randomIndex];
        System.out.println("Введите слово");

        while (true) {
            String userWord = scanner.nextLine();
            String guessedCharacters = "";
            char currentSymbol;
            int minLengthWord = Math.min(findWord.length(), userWord.length());
            for (int i = 0; i < minLengthWord; i++) {
                currentSymbol = findWord.charAt(i);
                if (currentSymbol == userWord.charAt(i)) {
                    guessedCharacters = guessedCharacters.concat(String.valueOf(currentSymbol));
                } else {
                    guessedCharacters = guessedCharacters.concat("#");
                }
            }
            if (findWord.equals(guessedCharacters)) {
                System.out.println("Вы угадали!");
                break;
            } else {
                int lengthVar = 15 - guessedCharacters.length();
                for (int i = 0; i < lengthVar; i++) {
                    guessedCharacters = guessedCharacters.concat("#");
                }
                System.out.println("Угаданные буквы " + guessedCharacters);
                System.out.println("Вы не угадали слово, попробуйте еще раз");
            }
        }
    }

}
