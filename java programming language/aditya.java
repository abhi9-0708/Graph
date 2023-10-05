//import java.security.PublicKey;
import java.util.Scanner;

class account {
    public int accountNumber;
    public String accountType;
    public String ServiceBranchIFSC;
    private float minimumBalence;
    private float availableBalence;
    public  int customerID;
    public String customerName;
    public int totalAccountCreated;



  public account() {

  }
  // set book details;
  public void  setDetails (int accNum, String type, String IFSC, float minBal, float avlBal, int id, String name,int total) {
     accountNumber = accNum;
     accountType=type;
     ServiceBranchIFSC= IFSC;
     minimumBalence=minBal;
     availableBalence=avlBal;
     customerID= id;
     customerName= name;
     totalAccountCreated=total;

   }


    public void getDetails(int accNum) {
       if(accountNumber==accNum) {
        System.out.println("accountNumber: " +accountNumber);
        System.out.println("accountType: " +accountType);
        System.out.println("ServiceBranchIFSC: " +ServiceBranchIFSC);
        System.out.println("minimumBalence: "+ minimumBalence);
        System.out.println("AvailableBalence: "+ availableBalence);
        System.out.println("customerName: "+customerName);
        System.out.println("Total account created: "+totalAccountCreated);
       }   
       else {
        System.out.println("No such account number is found");
       } 
}
}


public class aditya {
    public static void main (String[] args) {
        Scanner scanner= new Scanner(System.in);
        account[] customer= new account[3];

        customer[0]= new account();
        customer[0].setDetails(3000, "Personal", "IFSC01",(2.25f),2000.23f, 101,"Aditya",3);
       
        customer[1]= new account();
        customer[1].setDetails(4000, "Personal", "IFSC02",4.25f ,3000.23f, 101,"Ranjan",4);

        customer[2]= new account();
        customer[2].setDetails (5000, "Personal", "IFSC03",6.25f ,4000.23f, 101,"kumar",5);
       
    
    scanner.close();
    }
}
