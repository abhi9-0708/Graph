import java.util.ArrayList;
import java.util.Scanner;

class Account{
    public int accountNumber;
    private String accountType;
    private String serviceBranchIFSC;
    private float minimumBalance;
    public float availableBalance;
    private int customerId;
    private String customerName;

    public static int totalAccountCreated;

    Account(){
        totalAccountCreated++;
    }

    public void setDetails(){
        this.availableBalance = -1;
        this.minimumBalance = -1;
    }

    public void setDetails(int accountNo, String accType, String IFSC, float minBalance,
                           float availBalance, int custmId, String custmName){
        this.accountNumber = accountNo;
        this.accountType = accType;
        this.serviceBranchIFSC = IFSC;
        this.minimumBalance = minBalance;
        this.availableBalance = availBalance;
        this.customerId = custmId;
        this.customerName = custmName;
    }
    public void getDetails(int accountNo){
               System.out.println("Account number: "+ this.accountNumber);
               System.out.println("Account type: "+ this.accountType);
               System.out.println("Service Branch IFSC : "+ this.serviceBranchIFSC);
               System.out.println("Minimum Balance : "+ this.minimumBalance);
               System.out.println("Available Balance: "+ this.availableBalance);
               System.out.println("Customer ID: "+ this.customerId);
               System.out.println("Customer Name: "+ this.customerName);
    }

    private void updateAccNo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new Account number");
        int newAccNo = scanner.nextInt();

        this.accountNumber = newAccNo;
        System.out.println("Account number updated successfully");
    }

    private void updateAccType(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new Account Type");
        String newAccType = scanner.nextLine();

        this.accountType = newAccType;
        System.out.println("Account Type updated successfully");
    }

    public void updateIFSC(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new IFSC code");
        String newIFSC = scanner.nextLine();

        this.serviceBranchIFSC = newIFSC;
        System.out.println("IFSC updated successfully");
    }

    public void updateMinBalance(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new Minimum Balance");
        float newMinBalance = scanner.nextFloat();

        this.minimumBalance = newMinBalance;
        System.out.println("Minimum Balance updated successfully");
    }

    public void updateCustmId(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new customer ID");
        int newCustmID = scanner.nextInt();

        this.customerId = newCustmID;
        System.out.println("Customer ID updated successfully");
    }

    public void updateCustmName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new name");
        String newName = scanner.nextLine();

        this.customerName = newName;
        System.out.println("Customer Name updated successfully");
    }
    public void updateDetails(Account temp, int accountNo){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 1: Update Account Number");
        System.out.println("Press 2: Update Account Type");
        System.out.println("Press 3: Update Service Branch IFSC");
        System.out.println("Press 4: Update Minimum Balance");
        System.out.println("Press 5: Update Customer ID");
        System.out.println("Press 6: Update Customer Name");
        System.out.println("Press 7: Exit");

        int choice = scanner.nextInt();
        while(choice != 7){
            switch (choice){
                case 1:
                    temp.updateAccNo();
                    break;
                case 2:
                    temp.updateAccType();
                    break;
                case 3:
                    temp.updateIFSC();
                    break;
                case 4:
                    temp.updateMinBalance();
                    break;
                case 5:
                    temp.updateCustmId();
                    break;
                case 6:
                    temp.updateCustmName();
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
            System.out.println();
            System.out.println("Press 1: Update Account Number");
            System.out.println("Press 2: Update Account Type");
            System.out.println("Press 3: Update Service Branch IFSC");
            System.out.println("Press 4: Update Minimum Balance");
            System.out.println("Press 5: Update Customer ID");
            System.out.println("Press 6: Update Customer Name");
            System.out.println("Press 7: Exit");
            choice = scanner.nextInt();
        }
    }

    public float getBalance(int accountNo){
         return this.availableBalance;
    }

    public void deposit(int accountNo){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount to deposit:");
        int amount = scanner.nextInt();

        this.availableBalance += amount;
        System.out.println(amount + " added successfully to your account");
    }

    public void withdraw(int accountNo){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount to withdraw");
        int amount = scanner.nextInt();

        if(amount > this.availableBalance){
            System.out.println("your balance is just: "+  this.availableBalance);
            System.out.println("withdrawal can not be done");
            return;
        }

        this.availableBalance -= amount;
        System.out.println(amount + "deducted from your account");
    }

    public static int totalAccount(){
        return totalAccountCreated;
    }

    public void compare(Account acc1, Account acc2){
        if(acc1.availableBalance >= acc2.availableBalance)
            acc1.getDetails(acc1.accountNumber);
        else
            acc2.getDetails(acc2.accountNumber);
    }
}

/////////////////////////////////////////////////////////////////////////

public class Ass5_acc{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of accounts to be created");
        int size = scanner.nextInt();

        Account[] account = new Account[size];
        for (int i = 0; i < size; i++) {
            account[i] = new Account();
            account[i].setDetails();
        }

        System.out.println("Press 1: Set Details");
        System.out.println("Press 2: Get Details");
        System.out.println("Press 3: Update Details");
        System.out.println("Press 4: Get Balance");
        System.out.println("Press 5: Deposit");
        System.out.println("Press 6: Withdraw");
        System.out.println("Press 7: Total accounts created yet");
        System.out.println("Press 8: Compare");
        System.out.println("Press 9: Exit");

        int choice = scanner.nextInt();
        while (choice != 9) {
            switch (choice) {
                case 1:
                    fillDetails(account);
                    break;

                case 2:
                    showDetails(account);
                    break;

                case 3:
                    updation(account);
                    break;

                case 4:
                    showBalance(account);
                    break;

                case 5:
                    deposition(account);
                    break;

                case 6:
                    withdrawal(account);
                    break;

                case 7:
                    totalAcc(account);
                    break;

                case 8:
                    comparision(account);
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            System.out.println();
            System.out.println("Press 1: Set Details");
            System.out.println("Press 2: Get Details");
            System.out.println("Press 3: Update Details");
            System.out.println("Press 4: Get Balance");
            System.out.println("Press 5: Deposit");
            System.out.println("Press 6: Withdraw");
            System.out.println("Press 7: Total accounts created yet");
            System.out.println("Press 8: Compare");
            System.out.println("Press 9: Exit");

            choice = scanner.nextInt();
        }
    }
    public static void comparision(Account[] account){
        System.out.println("Enter index position of two accounts that are to be compared");
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int j = scanner.nextInt();

        account[0].compare(account[i], account[j]);
    }
    public static void totalAcc(Account[] account){
        System.out.println(Account.totalAccount());
    }
    public static void withdrawal(Account[] account){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number");
        int accNo = scanner.nextInt();

        for (int i = 0; i < account.length; i++) {
            if (account[i].accountNumber == accNo) {
                float oldBal = account[i].availableBalance;
                account[i].withdraw(accNo);

                System.out.println("old balance: "+oldBal);
                System.out.println("new balance: "+account[i].availableBalance);
                return;
            }
        }
        System.out.println("Account number not found");
    }
    public static void deposition(Account[] account){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number");
        int accNo = scanner.nextInt();

        for (int i = 0; i < account.length; i++) {
            if (account[i].accountNumber == accNo) {
                float oldBal = account[i].availableBalance;
                account[i].deposit(accNo);

                System.out.println("old balance: "+oldBal);
                System.out.println("new balance: "+account[i].availableBalance);
                return;
            }
        }
        System.out.println("Account number not found");
    }
    public static void showBalance(Account[] account){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number");
        int accNo = scanner.nextInt();

        for (int i = 0; i < account.length; i++) {
            if (account[i].accountNumber == accNo) {
                System.out.println(account[i].getBalance(accNo));
                return;
            }
        }
        System.out.println("Account number not found");
    }
    public static void updation(Account[] account) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number");
        int accNo = scanner.nextInt();

        for (int i = 0; i < account.length; i++) {
            if (account[i].accountNumber == accNo) {
                account[i].updateDetails(account[i], accNo);
                return;
            }
        }
        System.out.println("Account number not found");
    }

    public static void showDetails(Account[] account) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number");
        int accNo = scanner.nextInt();

        for (int i = 0; i < account.length; i++) {
            if (account[i].accountNumber == accNo) {
                account[i].getDetails(accNo);
                return;
            }
        }
        System.out.println("Account number not found");
    }

    public static void fillDetails(Account[] account) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < account.length; i++) {
            System.out.println("Enter details");
            System.out.println("Account number");
            int accNo = scanner.nextInt();

            scanner.nextLine();
            System.out.println("Account Type");
            String accType = scanner.nextLine();

            System.out.println("IFSC code");
            String IFSC = scanner.nextLine();

            System.out.println("Minimum Balance");
            float minBalance = scanner.nextFloat();

            System.out.println("Available Balance");
            float availBalance = scanner.nextFloat();

            System.out.println("Customer ID");
            int custmID = scanner.nextInt();

            scanner.nextLine();
            System.out.println("Customer Name");
            String custmName = scanner.nextLine();

            account[i].setDetails(accNo, accType, IFSC, minBalance, availBalance, custmID, custmName);
            System.out.println();
        }
    }
}
