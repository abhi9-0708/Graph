public class OOPS {
    public static void main(String args[]){
        Pen p1=new Pen();//created a pen object p1
        p1.setColor("Blue");//note blue is passed in double quotes string so..
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color="Yellow";
        System.out.println(p1.color);
        /////////////////////////////////
        BankAccount myAcc=new BankAccount();
        myAcc.name="ABHINAV KUMAR";
        // myAcc.password="ned893okndwe";// gives error bcz it is private
        myAcc.setPassword("ndiow02]amx");
        //System.out.println(myAcc.password); gives error bcz it is private
        System.out.println(myAcc.getpassword());


    }
    
}
class BankAccount{
    public String name;
    private String password;

    void setPassword(String pwd){
        password =pwd;
    }
    String getpassword(){
        return this.password;
    }
}
class Pen{
    String color;
    int tip;

    void setColor(String newcolor){
        color =newcolor;
    }
    void setTip(int newtip){
        tip=newtip;
    }


}
class Student{
    int rollno;
    String name;
    String branch;
    int cgpa;

    void setInfo(int roll,String stu_name,String branch_name,int stu_cgpa){
        rollno= roll;
        name= stu_name;
        branch=branch_name;
        cgpa=stu_cgpa;
    }

}
