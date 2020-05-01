import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contactList = new ArrayList<Contact>();
    public void printList() {
        for(int i=0; i<contactList.size(); i++) {
            System.out.println((i+1) + " -> " + contactList.get(i).getName() + " : " + contactList.get(i).getPhoneNumber());
        }
    }
    public void addContact(Contact newContact) {
        if(findContactIndex(newContact.getName()) == -1) {
            contactList.add(newContact);
            System.out.println("Name : " + newContact.getName() + " -> Phone number : " + newContact.getPhoneNumber() + " -> is added your contacts");
        } else {
            System.out.println("The person you want to add already exists in your contacts.");
        }
    }
    public void updateContact(Contact updatedContact) {
        int index = findContactIndex(updatedContact.getName());
        if(index != -1){
            contactList.set(index, updatedContact);
            System.out.println("Name : " + updatedContact.getName() + " -> Phone number : " + updatedContact.getPhoneNumber() + "-> is updated your contacts.");
        } else {
            System.out.println("The person you update to add doesn't exist in your contacts");
        }
    }
    public void removeContact(String name) {
        int index = findContactIndex(name);
        if(index != -1){
            contactList.remove(index);
            System.out.println("Name : " + name + " is successfuly removed to your contacts");
        } else {
            System.out.println("The person you want to remove doesn't exist in your contacts");
        }
    }
    public boolean findContact(String name) {
        int index = findContactIndex(name);
        if(index != -1){
            return true;
        }
        return false;
    }
    private int findContactIndex(String name) {
        for(int i=0; i<contactList.size(); i++){
            if(contactList.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
