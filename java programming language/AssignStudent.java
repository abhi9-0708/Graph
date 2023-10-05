import java.util.ArrayList;

public class AssignStudent {
    private String name;
    private int rollNumber;
    private ArrayList<Integer> grades;

    public void Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int total = 0;
        for (int grade : grades) {
            total += grade;
        }

        return (double) total / grades.size();
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grades: " + grades);
        System.out.println("Average Grade: " + calculateAverageGrade());
    }

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        // Create students and add grades
        Student student1 = new Student("Alice", 101);
        student1.addGrade(90);
        student1.addGrade(85);
        student1.addGrade(92);

        Student student2 = new Student("Bob", 102);
        student2.addGrade(78);
        student2.addGrade(88);
        student2.addGrade(95);

        studentList.add(student1);
        studentList.add(student2);

        // Display student information
        for (Student student : studentList) {
            student.displayStudentInfo();
            System.out.println();
        }
    }
}

