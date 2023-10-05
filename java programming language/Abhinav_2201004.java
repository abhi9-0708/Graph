import java.util.*;
public class Abhinav_2201004 {
    public static void main(String args[]){
        ArrayList<Items>itemList=new ArrayList <>();
        ArrayList<Sell>sellList=new ArrayList <>();
        ArrayList<Return>returnList=new ArrayList <>();
        Items i1=new Items(01,200,100);
        itemList.add(i1);
        Scanner sc=new Scanner(System.in);
        int ch=0;
        while(ch!=4){
            System.out.println("press1->setup");
            System.out.println("press2->normalUser mode");
            System.out.println("press3->NormalUserMode");
            System.out.println("press 4->Exit");

            System.out.println("enter your choice");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    Items i=new Items();
                    //i.addNewStack(i);
                    // itemList.add(i);
                    // break;
                case 2:
                    // System.out.println("enter the itemcode whose item is to be deleted:");
                    // int code=sc.nextInt();
                    // for(Items it:itemList){
                    //     if()
                    // }
                 
            }

        }
    }
    
}
class User{
    String name;
    String dateOfBirth;
    String Adress;
    int PAN;
    User(){
        //
    }
    User(String name,String dateOfBirth,String Adress,int PAN){
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.Adress=Adress;
        this.PAN=PAN;
    }


}
class SuperUser extends User{
    
    String password;
    String dateOfjoining;
    int salary;
    String permissibleOperations;
    SuperUser(String pass,String doj,int salary,String permissibleOperationds){

        this.password=pass;
        this.dateOfjoining=doj;
        this.salary=salary;
        this.permissibleOperations=permissibleOperationds;
    }
    public void addNewStack(Item i){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter password:");
        this.password=sc.nextLine();
        System.out.println("Enter the dateOfjoining");
        this.dateOfjoining=sc.nextLine();
        System.out.println("enter the salary");
        this.salary=sc.nextInt();
        sc.nextLine();
        System.out.println("enter permissibleOperations ");
        this.permissibleOperations=sc.nextLine();

    }


}
class NormalUser extends User{
    int userID;
    String dateOfjoining;
    int salary;
    Double dutyHourPerDay;
    NormalUser(int userID,String dateOfjoining,int salary,Double dutyHourPerDay){
        this.userID=userID;
        this.dateOfjoining=dateOfjoining;
        this.salary=salary;
        this.dutyHourPerDay=dutyHourPerDay;
    }
    public void addNewStock(Item item, ArrayList<Item> stock) {
        stock.add(item);
    }
    public void deleteStock(int itemCode, ArrayList<Item> stock) {
        for (Item item : stock) {
            if (item.getItemCode() == itemCode) {
                stock.remove(item);
                break;
            }
        }
    }
    public void modifyStock(int itemCode, double newPrice, int newAvailableQty, ArrayList<Item> stock) {
        for (Item item : stock) {
            if (item.getItemCode() == itemCode) {
                item.setPrice(newPrice);
                item.setAvailableQty(newAvailableQty);
                break;
            }
        }
    }

    

}
class Items{
    int itemCode;
    int price;
    int availableQuantity;
    Items(){

    }
    Items(int itemCode,int price,int availableQuantity){
        this.itemCode=itemCode;
        this.price=price;
        this.availableQuantity=availableQuantity;
    }
    public int getitemCode(){
        return this.itemCode;
    }

}
class Consumables extends Items{
    String dateOfExpiery;
    Consumables(){
        if(this.itemCode%2==0){
            System.out.println("itemCount is valid");
        }
    }


}
class NonConsumables extends Items{
    int returnCount;
    NonConsumables(){
        if(this.itemCode%2==1){
            System.out.println("itemCount is valid");
        }
    }
    


}
class Sell{
    String dateOfSell;
    int itemCode;
    int quantity;
    int returnAmount;
    



}
class Return{
    String dateOfReturn;
    int itemCode;
    int quantity;
    int returnAmount;
    Return(int itemCode, int quantity) { 
        this.itemCode = itemCode;
        this.quantity = quantity;
        this.returnAmount = calculateReturnAmount(itemCode, quantity);
    }

    public String getDateOfReturn() {
        return dateOfReturn;
    }

    public int getItemCode() {
        return itemCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getReturnAmount() {
        return returnAmount;
    }

}