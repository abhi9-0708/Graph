import java.util.*;
public class USERINHERITANCE {
    
    public static void main(String args[]){
        ArrayList<User>user=new ArrayList<>();

        int choice=0;
        while(choice !=6){
            Scanner sc=new Scanner(System.in);
            System.out.println("1->enter the new entry of student");
            System.out.println("2->enter the new entry of staff");
            System.out.println("3->enter the new entry of faculty");
            System.out.println("4->Get details");
                        
            System.out.println("enter your choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter the details of new student");
                    Student student=new Student();
                    student.setdetails();
                    user.add(student);
                    break;
                case 2:
                    System.out.println("enter the details of new staff");
                    Staff staff=new Staff();
                    staff.setdetails();
                    user.add(staff);
                    break;
                case 3:
                    System.out.println("enter the details of new faculty");
                    Faculty faculty=new Faculty();
                    faculty.setdetails();
                    user.add(faculty);
                    break;
                case 4:
                    System.out.println("enter the user id to get details:");
                    int a=sc.nextInt();
                    for(User u:user){
                        if(u.getuserid()==a){
                            u.getdetails();
                        }
                    }
                // case 5:
                //     int p,q;
                //     System.out.println("enter the user id1 to check designation");
                //     int a1=sc.nextInt();
                //     System.out.println("enter the user id1 to check designation");
                //     int a2=sc.nextInt();
                //     //hassamedesignation(user,a1,a2);
                    
                //     break;
                    





            }


        
            
        }


    }
    
}
class User{
    String name;
    String dateOfBirth;
    int userId;
    String adress;
    String email;

    User(){
        //
    }
    User(String s_name,String dob,int id,String user_adress,String usermail){
        this.name=s_name;
        this.dateOfBirth=dob;
        this.userId=id;
        this.adress=user_adress;
        this.email=usermail;

    }
    public void setdetails(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the name :");
        this.name=sc.nextLine();
        
        System.out.println("enter the date of birth:");
        this.dateOfBirth=sc.nextLine();
        System.out.println("enter the user id:");
        this.userId=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the adress:");
        this.adress=sc.nextLine();
        
        System.out.println("enter the email:");
        this.email=sc.nextLine();
    }
    public int getuserid(){
        return this.userId;
    }
    public void getdetails(){
       System.out.println("user id is:"+this.userId);
       System.out.println("name: "+this.name);
       System.out.println("date of birth is:"+this.dateOfBirth);  
       System.out.println("adress is:"+this.adress);
       System.out.println("email is:"+this.email);


    }

    

}
class Student extends User{
    int rollNumber;
    int semester;
    Float cpi;

    public void setdetails(){
        //super();
        super.setdetails();
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the roll no:");
        this.rollNumber=sc.nextInt();
        System.out.println("enter the semester:");
        this.semester=sc.nextInt();
        System.out.println("enter the cpi");
        this.cpi=sc.nextFloat();
    }


}
class Staff extends User{
    int employeeId;
    String sectionName;
    String designation;

    public void setdetails(){
        super.setdetails();
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the employee id:");
        this.employeeId=sc.nextInt();
        System.out.println("enter the section name:");
        this.sectionName=sc.nextLine();
        sc.nextLine();
        System.out.println("enter the designation:");
        this.sectionName=sc.nextLine();
    }
    public String ret_design(){
        return this.designation;

    }
    public void hassamedesignation(ArrayList<User>user,int s1,int s2){
         String str1,str2;
         for(User u:user){
         if(s1==u.getuserid()){
                 str1=u.designation;
                 str1=u.ret_design();
                 //str1 = u.designation.substring(0);

             }
         }
         }
     }
   
 
    

class Faculty extends User{
    int employeeID;
    String  departmentName;
    int  noOfPublications;

    public void setdetails(){
        super.setdetails();
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the employee id:");
        this.employeeID=sc.nextInt();
        System.out.println("enter the department:");
        this.departmentName=sc.nextLine();
        System.out.println("enter the no of publication:");
        this.noOfPublications=sc.nextInt();
    
    }
    // public void checkdepartment(){

    // }
}