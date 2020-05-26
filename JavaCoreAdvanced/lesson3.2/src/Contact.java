import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Contact {
    private String surname;
    private List<String> phoneNumbers = new ArrayList<>();

    Contact(String surname, String... phoneNumbers) {
        this.surname = surname;
        Collections.addAll(this.phoneNumbers, phoneNumbers);
    }

    String getSurname() {
        return surname;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    String getPhoneNumberString() {
        StringBuilder phones = new StringBuilder();
        for (int i = 0; i < phoneNumbers.size(); i++) {
            String phoneNumber = phoneNumbers.get(i);
            phones.append(phoneNumber);
            if (i != phoneNumbers.size()-1) {
                phones.append(", ");
            }
        }
        return phones.toString();
    }
}
