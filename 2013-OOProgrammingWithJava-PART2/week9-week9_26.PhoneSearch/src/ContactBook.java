import java.util.ArrayList;
import java.util.List;

public class ContactBook {
    private final List<Contact> contactBook;
    private Contact contact;

    public ContactBook() {
        this.contactBook = new ArrayList<Contact>();
    }

    //this method adds contact to contactbook
    public void addContact(String name) {
        contact = new Contact(name);
        if (!contactBook.contains(contact)) {
            this.contactBook.add(contact);
        }
    }
    
    //this method returns all the contact
    public List<Contact> getContacts() {
        return this.contactBook;
    }
}