public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(new Contact("Авдеенко", "+78562552555", "+7625458458"));
        phoneBook.add(new Contact("Стрельцов", "+75242525558"));
        phoneBook.add(new Contact("Неф", "+73568552545"));

        System.out.println(phoneBook.get("Неф"));
    }
}
