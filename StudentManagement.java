import java.util.*;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------");
    }
}

public class StudentManagement {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        students.add(new Student(id, name, marks));
    }

    static void displayStudents() {
        for(Student s : students) {
            s.display();
        }
    }

    static void searchStudent() {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();

        for(Student s : students) {
            if(s.id == id) {
                s.display();
                return;
            }
        }

        System.out.println("Student not found");
    }

    static void updateMarks() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for(Student s : students) {
            if(s.id == id) {
                System.out.print("Enter new marks: ");
                s.marks = sc.nextInt();
                System.out.println("Marks updated");
                return;
            }
        }
    }

    static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        students.removeIf(s -> s.id == id);
        System.out.println("Student removed");
    }

    public static void main(String[] args) {

        while(true) {
            System.out.println("1.Add Student");
            System.out.println("2.Display Students");
            System.out.println("3.Search Student");
            System.out.println("4.Update Marks");
            System.out.println("5.Delete Student");
            System.out.println("6.Exit");

            int choice = sc.nextInt();

            switch(choice) {
                case 1: addStudent(); break;
                case 2: displayStudents(); break;
                case 3: searchStudent(); break;
                case 4: updateMarks(); break;
                case 5: deleteStudent(); break;
                case 6: System.exit(0);
            }
        }
    }
}