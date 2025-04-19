import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {
    List<Contact> contactList = new ArrayList<>();

    public void addContact() {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String nameInput = scannerObj.next();
        System.out.println("Please enter your number:");
        int numberInput;
        while (true) {
            numberInput = scannerObj.nextInt();
            String numStr = String.valueOf(numberInput);
            if (numStr.length() == 9) { // valid: 9
                break;
            } else {
                System.out.println("Invalid Number, enter again");
            }
        }

        Contact contactObj = new Contact();
        contactObj.name = nameInput;
        contactObj.number = numberInput;

        contactList.add(contactObj);
    }

    public void printContacts() {
        for (Contact contact : contactList) { //enhanced for loop
            System.out.println("Name=[" + contact.name + "] Number=[" + contact.number + "]");
        }
    }


}
