class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    Employee(
            String name,
            String surname,
            String patronymic,
            String position,
            String email,
            String phoneNumber,
            int salary,
            int age
    ) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    int getAge() {
        return age;
    }

    void info() {
        System.out.printf("Сотрудник: %s %s %s\n должность: %s\n email: %s\n phone number: %s\n salary: %d\n age: %d\n ",
                surname, name, patronymic, position, email, phoneNumber, salary, age);
    }

}