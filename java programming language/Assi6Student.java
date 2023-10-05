import java.util.*;

public class Assi6Student {
    
    public static void main(String args[]) {
        ArrayList<Student> stu = new ArrayList<Student>();

        int choice = 0;
        while (choice != 5) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1->enter the details of student:");
            System.out.println("2->Average grade");
            System.out.println("3->add new subject with marks");
            System.out.println("4->display information");
            System.out.println("5->Exit");

            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter the name");
                    String n = sc.nextLine();
                    sc.nextLine();
                    System.out.println("enter the roll no:");
                    int a = sc.nextInt();
                    Student s = new Student(n, a);
                    System.out.println("enter the no of subject to add marks:");
                    int count=sc.nextInt();
                    for(int i=0;i<count;i++){
                        System.out.println("enter the  subject");
                        String str1 = sc.nextLine();
                        sc.nextLine();
                        System.out.println("enter the  marks");
                        int m = sc.nextInt();
                        s.addNewSubject(str1, m);

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
                            st.addNewSubject(str1, m);
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

            }

        }
    }
}


class Student {
    String name;
    int rollNo;
    ArrayList<Integer>grades=new ArrayList<Integer> ();

    Student() {

    };

    Student(String s, int a) {
        this.name = s;
        this.rollNo = a;
        this.grades = new ArrayList<>();

    }

    public void addGrade(int a) {
        grades.add(a);
    }

    public int retRoll() {
        return this.rollNo;
    }

    public void display(Student s) {
        System.out.println("name of student is :" + s.name);
        System.out.println("rollNumber of student is:" + s.rollNo);
        for (int i = 0; i < s.grades.size(); i++) {
            System.out.println(grades.get(i));

        }

    }

    public void addNewSubject(String sub, int grade) {
        this.grades.add(grade);
    }

    public void avgGrades(Student s) {
        // int count=0;
        System.out.println("hellow");
        int sum = 0;
        for (int i = 0; i < s.grades.size(); i++) {
            sum += s.grades.get(i);
        }
        int avg = sum / grades.size() ;
        System.out.println("average grade is:" + avg);
    }
}