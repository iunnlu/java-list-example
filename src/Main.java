import java.util.Scanner;

public class Main {
    public static void printMenu() {
        System.out.print("Welcome to your contact list \n" +
                           "1 -> Print List \n" +
                           "2 -> Add a new contact \n" +
                           "3 -> Update a contact \n" +
                           "4 -> Remove a contact \n" +
                           "5 -> Find a contact \n" +
                           "6 -> Quit \n");
    }
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        Scanner scan = new Scanner(System.in);
        String name, number;
        boolean loop = true;
        int menu = 0;
        printMenu();
        while(loop) {
            System.out.print("Please press any button for choosing your selection : ");
            menu = scan.nextInt();
            scan.nextLine();
            switch(menu) {
                case 0:
                    printMenu();
                    break;
                case 1:
                    phone.printList();
                    break;
                case 2:
                    System.out.print("Enter a name : ");
                    name = scan.nextLine();
                    System.out.print("Enter a phone number : ");
                    number = scan.nextLine();
                    phone.addContact(new Contact(name, number));
                    break;
                case 3:
                    System.out.print("Enter a name : ");
                    name = scan.nextLine();
                    System.out.print("Enter a phone number : ");
                    number = scan.nextLine();
                    phone.updateContact(new Contact(name, number));
                    break;
                case 4:
                    System.out.print("Enter a name : ");
                    name = scan.nextLine();
                    phone.removeContact(name);
                    break;
                case 5:
                    System.out.print("Enter a name : ");
                    name = scan.nextLine();
                    if(phone.findContact(name)) {
                        System.out.println("It was found");
                    } else {
                        System.out.println("It wasn't found");
                    }
                    break;
                case 6:
                    System.out.println("Closed program!");
                    loop = false;
                    break;
                default:
                    System.out.println("Wrong button!");
            }
        }
    }
}
