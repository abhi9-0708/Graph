import java.util.*;

public class newAss6Student {
    
    public static void main(String args[]) {
        ArrayList<Student> stu = new ArrayList<Student>();

        Scanner sc = new Scanner(System.in);

        int choice = 0;
        while (choice != 5) {
            
            System.out.println("1->enter the details of student:");
            System.out.println("2->Average grade");
            System.out.println("3->add new subject with marks");
            System.out.println("4->display information");
            System.out.println("5->Exit");

            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("enter the name");
                    String n = sc.nextLine(); 
                    System.out.println("enter the roll no:");
                    int a = sc.nextInt();
                    sc.nextLine();
                    Student s = new Student(n, a);
                    System.out.println("enter the no of subject to add marks:");
                    int count=sc.nextInt();
                    sc.nextLine();
                    for(int i=0;i<count;i++){
                        System.out.println("enter the  subject");
                        String str1 = sc.nextLine();
                        
                        System.out.println("enter the  marks");
                        int m = sc.nextInt();
                        sc.nextLine();
                        Node n1= new Node(str1,m);
                        s.addNewSubject(n1);

                    }
                    stu.add(s);

                    break;

                case 2:
                    System.out.println("enter the student rollno to get avg grade");
                    int r = sc.nextInt();
                    for (Student st : stu) {
                        if (st.retRoll() == r) {
                            st.avgGrades(st);

                        }
                    }
                    break;
                case 3:
                    System.out.println("enter the student rollno to get add subject nd marks");
                    int b = sc.nextInt();
                    for (Student st : stu) {
                        if (st.retRoll() == b) {
                            System.out.println("enter the  subject");
                            String str1 = sc.nextLine();
                            sc.nextLine();
                            System.out.println("enter the  marks");
                            int m = sc.nextInt();
                            Node n2=new Node(str1,m);
                            st.addNewSubject(n2);
                        }
                    }
                    break;

                case 4:
                    System.out.println("enter the student rollno to get avg grade");
                    int t = sc.nextInt();
                    for (Student st : stu) {
                        if (st.retRoll() == t) {
                            st.display(st);
                        }
                    }
                    break;
                case 5:
                    System.out.println("exiting...");
                    break;

            }

        }
    }
}

class Node {
    String subject;
    int marks;
    Node(String sub,int d){
        this.subject=sub;
        this.marks=d;
    }
    public String retSub(Node n){
        return n.subject;
    }
}

class Student {
    String name;
    int rollNo;
    ArrayList<Node>grades;

    Student() {

    };

    Student(String s, int a) {
        this.name = s;
        this.rollNo = a;
        this.grades = new ArrayList<Node>();

    }
    public String retname(Student s){
        return this.name;

    }

    public int retRoll() {
        return this.rollNo;
    }

    public void display(Student s) {
        System.out.println("name of student is :" + s.retname(s));
        System.out.println("rollNumber of student is:" + s.rollNo);
        for(Node n:s.grades){
                System.out.println("subject="+n.retSub(n));
                System.out.println("Marks="+n.marks);
        }
    }

    public void addNewSubject(Node n) {
        this.grades.add(n);
    }

    public void avgGrades(Student s) {
        // int count=0;
        int sum = 0;
        for(Node n:s.grades){
                sum+=n.marks;
        }
        
        int avg = sum / grades.size() ;
        System.out.println("average grade is:" + avg);
    }
}
