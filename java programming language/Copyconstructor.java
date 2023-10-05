public class Copyconstructor {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Abhinav";
        System.out.println(s1.name);
        s1.rollno=2201004;
        System.out.println(s1.rollno);
        s1.password="nr3304rmremf";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        // if s1 has forgotten his password then creating object s2 with same features
        Student s2=new Student(s1);//here the marks of s1 is copied to s2;
        //now changing the value of s1.marks and seeing its effect on s2
        s1.marks[0]=70;
        s2.password="neu83frm";
        System.out.println(s2.name);
        System.out.println(s2.rollno);
        System.out.println(s2.password);
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]+" ");
        }

    }
    
}
class Student{
    String name;
    int rollno;
    String password;
    int marks[];
    

    Student(){
        marks= new int[3];
        System.out.println("Constructor is called");
    }
    Student(Student s ){
        marks= new int[3];//note here marks[] is not written
        this.rollno=s.rollno;// this refer new object or current object
        this.name=s.name;
        this.marks=s.marks;
    }
    Student(int rollno){
        marks=new int[3];
        this.rollno=rollno;   
    }
} 
