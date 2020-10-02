import java.util.*;
public class AddressBook {

#All methods for addressbook
    
    public static LinkedList<BuddyInfo> budList = new LinkedList();

    public void addBuddy(BuddyInfo bud) {

        budList.add(bud);

    }

    public void removeBuddy(BuddyInfo x)
    {
        budList.remove(x);
    }

    public static void main(String[] name) {

        BuddyInfo bud = new BuddyInfo("Areeb","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(bud);
        addressBook.removeBuddy(bud);

    }

}
