import java.util.*;

class Student {
    int id;
    String name;
    ArrayList<String> courses = new ArrayList<>();

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}



public class Main {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("1. Add Student");
            System.out.println("2. Register Course");
            System.out.println("3. View Registered Courses");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    registerCourse();
                    break;
                case 3:
                    viewStudents();
                    break;
                case 4:
                    System.out.println("Exit");
                    System.out.println("made by chirag");
                    break;
                default:
                    System.out.println("choice is not in option ");
            }

        } while (choice != 4);
    }

    static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.id == id) {
                System.out.println("Student ID already exists!");
                return;
            }
        }

        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        students.add(new Student(id, name));
        System.out.println("Student added successfully!");
    }

    static void registerCourse() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        Student found = null;
        for (Student s : students) {
            if (s.id == id) {
                found = s;
                break;
            }
        }
        if (found == null) {
            System.out.println("Student not found!");
            return;
        }
        sc.nextLine();
        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();
        found.courses.add(course);
        System.out.println("Course registered done");
    }
    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }
        for (Student s : students) {
            System.out.println("\nID: " + s.id);
            System.out.println("Name: " + s.name);
            if (s.courses.isEmpty()) {
                System.out.println("Courses: None");
            } else {
                System.out.println("Courses: " + s.courses);
            }
        }
    }
}
