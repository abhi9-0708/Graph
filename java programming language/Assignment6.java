import java.util.*;
public class Assignment6 {
    public static void main(String args[]){
        ArrayList<Account>accountlist=new ArrayList<>();

        int choice=0;
        while(choice !=9){
            Scanner sc=new Scanner(System.in);
            System.out.println("\nBanking Application Menu:");
            System.out.println("1. set Details");
            System.out.println("2. Get Details");
            System.out.println("3. update details");
            System.out.println("4. get balance");
            System.out.println("5. deposit");
            System.out.println("6. withdraw");

            System.out.println("7. total account");
            System.out.println("8.compare");
            System.out.println("9.Exit");
    
            System.out.print("Enter your choice:");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("enter the details of new account");
                    Account ac=new Account();
                    ac.setDetails();
                    accountlist.add(ac);
                    break;
                case 2:
                    System.out.print("Enter the account no to get details:");
                    int a=sc.nextInt();
                    for(Account account:accountlist){
                        if(account.getAccountNo()==a){
                            account.getDetails(a);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter the account no to update details:");
                    a=sc.nextInt();
                    for(Account account:accountlist){
                        if(a==account.getAccountNo()){
                            account.updateDetails(a);
                        }
                    }
                break;
                case 4:
                    System.out.print("Enter the account no to get balance:");
                    a=sc.nextInt();
                    for(Account account:accountlist){
                        if(a==account.getAccountNo()){
                            System.out.println(account.getBalance(a));
                        }
                    }
                break;
                case 5:
                    System.out.print("Enter the account no to deposit balance:");
                    a=sc.nextInt();
                    for(Account account:accountlist){
                        if(a==account.getAccountNo()){
                            account.deposit(a);
                        }
                    }
                    break;
                case 6:
                    System.out.print("Enter the account no to withdraw balance:");
                    a=sc.nextInt();
                    for(Account account:accountlist){
                        if(a==account.getAccountNo()){
                            account.withdraw(a);
                        }
                    }
                    break;
                case 7:
                    System.out.println("Total account created is:"+Account.totalAccount());
                    break;
                case 8:
                    System.out.print("Enter the accountno 1 to compare:");
                    a=sc.nextInt();
                    System.out.print("Enter the accountno 2 to compare:");
                    int b=sc.nextInt();
                    Account.compare(accountlist,a,b);
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                  
            }
            //sc.close();
            }
        }
}
    

class Account{
    private int accountNumber;
    private String accountType;
    private String serviceBranchIFSC;
    private float minimumBalance;
    private float availableBalance;
    private int customerID;
    private String customerName;
    private static int totalAccountCreated=0;

    Account(){

        minimumBalance=0;
        availableBalance=0;
    }
    public int getAccountNo(){
        return this.accountNumber;
    }

    public void setDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the account number:");
        accountNumber=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the account type");
        accountType=sc.nextLine();
        System.out.println("Enter the service branch IFSC");
        serviceBranchIFSC=sc.nextLine();
        System.out.println("Enter the minimum Balance:");
        minimumBalance=sc.nextFloat();
        System.out.println("Enter the available balance:");
        availableBalance=sc.nextFloat();
        System.out.println("Enter the customerID:");
        customerID=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the customer name:");
        customerName=sc.nextLine();
        totalAccountCreated++;
        //sc.close();
       
    }
    public static int totalAccount(){
        return totalAccountCreated;
    }
    
    public void getDetails(int accno){
        System.out.println("account number = "+ this.accountNumber);
        System.out.println("account type = "+ this.accountType);
        System.out.println("service Branch IFSC = "+ this.serviceBranchIFSC);
        System.out.println("minimum Balance is= "+this.minimumBalance);
        System.out.println("available Balance is = "+this.availableBalance);
        System.out.println("customer ID is="+this.customerID);
        System.out.println("customer Name is="+this.customerName);
    }

    public void updateDetails(int accno){
        int ch=0;
        while(ch != 5){
            Scanner sc= new Scanner(System.in);
            System.out.println("1->update minimum balance");
            System.out.println("2->update available balance");
            System.out.println("3->update customer Id");
            System.out.println("4->update Customer name:");
            System.out.println("5->exit update ");
            System.out.println("enter your choice:");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println(" enter the minimum balance");
                    minimumBalance=sc.nextFloat();
                    break;
                case 2:
                    System.out.println(" enter the available balance");
                    availableBalance=sc.nextFloat();
                    break;
                case 3:
                    System.out.println(" enter the customer Id");
                    customerID=sc.nextInt();
                    break;
                case 4:
                    System.out.println(" enter the customer Name");
                    customerName=sc.nextLine();
                    break;
                case 5:
                    System.out.print("update menu exited");
                    break;
                default:
                    System.out.println("enter the valid choice");

            }
            //sc.close();
        }

    }
    public Float getBalance(int accno){
         return this.availableBalance;
    }
    public void deposit(int accno){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount to deposit:");
        int dep=sc.nextInt();
        availableBalance+=dep;
        System.out.println("deposit successful");
        System.out.println("new Available balance="+availableBalance);
        //sc.close();
    }
    public void withdraw(int accno){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount to withdraw:");
        int draw=sc.nextInt();
        availableBalance-=draw;
        System.out.println("withdraw successful");
        System.out.println("new Available balance="+availableBalance);
        //sc.close();

    }
    public static void compare(ArrayList <Account> arraylist ,int a,int b){
        float b1=0;
        float b2=0;
        for(Account ac:arraylist){
            if(ac.accountNumber==a){
                 b1=ac.getBalance(a);    
            }
            else if(ac.accountNumber==b){
                 b2=ac.getBalance(b);
            }
        }
        if(b1<b2){
                System.out.println("account 1 has less balance then account 2 by:"+ (b2-b1));
            }
        else{
            System.out.println("account 2 has less balance then account 1 by:"+ (b1-b2));
        }
    }

}
