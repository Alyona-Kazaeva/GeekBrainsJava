import java.util.HashMap;
import java.util.Map;

class PhoneBook {
    private Map<String, Contact> contacts = new HashMap<>();

    void add(Contact contact) {
        contacts.put(contact.getSurname(), contact);
    }

    String get(String surname) {
        Contact contact = contacts.get(surname);
        return contact.getPhoneNumberString();
    }

}