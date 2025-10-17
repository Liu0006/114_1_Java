public class AccountTest {
    private int customerCount;
    public static void main (String[] args)
    {
        Account customers = new Account[10];
        Account ace1 = new Account(accountNumber: "A001", ownerName: "Alice", initialBalance:5000);
        addCustomer(customers, acc1);
        Account acc2 = new Account(accountNumber: "A002", ownerName: "Bob", initialBalance:3000);
        addCustomer(customers, acc2);
        Account acc3 = new Account(accountNumber: "A002", ownerName:"Charlie", initialBalance:-100);
        addCustomer(customers, acc3);
    }
    System.out.println("\n")
}

public  static void addCustomer (Account[] customers)
