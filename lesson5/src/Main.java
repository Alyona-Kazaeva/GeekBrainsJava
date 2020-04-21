public class Main {
    public static void main(String[] args) {

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Петр", "Иванов", " Валерьянович", "Сварщик",
                "petrIvanov@mail.ru", "+78524587585", 25000, 35);
        employeeArray[1] = new Employee("Семен", "Золотухин", " Аркадьевич", "Машинист",
                "semenZol@mail.ru", "+79653654141", 30000, 28);
        employeeArray[2] = new Employee("Сергей", "Герасимов", " Андреев", "Слесарь",
                "sergeiGerasim@mail.ru", "+79413658585", 27000, 55);
        employeeArray[3] = new Employee("Мария", "Строева", "Сергеевна", "Инструктор",
                "mariaStroeva@mail.ru", "+78356582121", 29500, 31);
        employeeArray[4] = new Employee("Константин", "Васильев", "Владимирович", "Столяр",
                "konstantinVas@mail.ru", "+78245365252", 31000, 42);


        for (Employee employee : employeeArray) {
            if (employee.getAge() > 40) {
                employee.info();
                System.out.println();
            }
        }

    }
}
