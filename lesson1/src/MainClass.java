public class MainClass {

    public static void main(String[] args) {
        // 2. Создать переменные всех пройденных типов данных, и инициализировать их значения
        byte a = 5;
        short b = 120;
        int c = 300;
        long d = 5452245L;
        float e = 1.5f;
        double f = 1.254;
        char g = 'f';
        boolean h = true;

        calculate(5, 2, 8, 2);
        sum10to20(6, 8);
        isPositiveOrNegative(-9);
        isNegativeNumber(8);
        helloName("Алёна");
    }

    /**
     * 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
     * где a, b, c, d – входные параметры этого метода
     */
    static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    /**
     * 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от
     * 10 до 20(включительно), если да – вернуть true, в противном случае – false
     */
    static boolean sum10to20(int x1, int x2) {
        return x1 + x2 >= 10 || x1 + x2 <= 20;
    }

    /**
     * 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
     * в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
     */
    static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    /**
     * 6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true,
     * если число отрицательное
     */
    static boolean isNegativeNumber(int x) {
        return x < 0;
    }

    /**
     * 7. Написать метод, которому в качестве параметра передается строка,
     * обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»
     */
    static void helloName(String name) {
        System.out.println(String.format("Hello, %s!", name));
    }

}