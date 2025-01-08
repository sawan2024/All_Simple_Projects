import java.util.ArrayList;
import java.util.Scanner;

 class Contact{
    private String Name;
    private String Address;
    private String PhoneNumber;
   public Contact(String Name,String Address,String PhoneNumber){
       this.Name = Name;
       this.Address = Address;
       this.PhoneNumber = PhoneNumber;
    }
    public String getName(){
       return Name;
    }
    public String getAddress(){
       return Address;
    }
    public String getPhoneNumber(){
       return PhoneNumber;
    }
    @Override
    public String toString(){
       return "UserName : "+ getName() +", \nAddress : "+getAddress()+", \nPhoneNumber : "+getPhoneNumber();
    }
}
class  AddressBook{
    ArrayList<Contact> Contacts = new ArrayList<>(5);
    public void addContact(Contact sa){// Contact is a data type defined and sa is variable
        Contacts.add(sa);
        System.out.println("Add contact Successful");
    }
    public void DisplayContacts(){
        if (Contacts.isEmpty()){
            System.out.println("contact not Found");
        }else{
            for (Contact ab1 : Contacts){
                System.out.println(ab1);
                System.out.println("--------------------");
            }
        }
    }
    public void searchContact(String Name){
        boolean found = false;
        for (Contact var1 : Contacts) {
            if (var1.getName().equalsIgnoreCase(Name)) {
                System.out.println(var1);
                found = true;
                break;
            }
        }
            if(!found){
                System.out.println("Contact not found");
            }
        }
        public void deleteContact(String Name1){
        boolean remove = Contacts.removeIf(cont  ->cont.getName().equalsIgnoreCase(Name1)); //contact name change and test
        if(remove){
            System.out.println("Contact Delete Successful");
        }else{
            System.out.println("Contact Not Found");
        }
        }
    }
public class Address_Contact {
    public static void main(String[] args) {
        AddressBook addressbook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\nAddress Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice =scanner.nextInt();
            scanner.nextLine();


            switch(choice){
                case 1:
                    System.out.print("Enter the Name : ");
                    String Name = scanner.nextLine();
                    System.out.print("Enter the Address : ");
                    String Address = scanner.nextLine();
                    System.out.print("Enter the PhoneNumber : ");
                    String PhoneNumber = scanner.nextLine();
                    addressbook.addContact(new Contact(Name,Address,PhoneNumber));
                    break;
                case 2:
                    addressbook.DisplayContacts();
                    break;
                case 3:
                    System.out.print("Enter the name : ");
                    String SearchName = scanner.nextLine();
                    addressbook.searchContact(SearchName);
                    break;
                case 4:
                    System.out.print("Enter The Name Your Wise to Delete");
                    String DeleteName = scanner.nextLine();
                    addressbook.deleteContact(DeleteName);
                    break;
                case 5:
                    System.out.print("Exit Address Book Good Bye");
                    break;
                default:
                    System.out.println("invalid input ");
            }
        }while(choice != 5);
            scanner.close();

    }
}
