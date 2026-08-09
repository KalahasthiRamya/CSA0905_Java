import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Priya");
        students.add("Arun");
        students.add("Sneha");

        System.out.println("Student List:");
        for (String student : students) {
            System.out.println(student);
        }

        students.remove("Arun");

        System.out.println("\nAfter removing Arun:");
        for (String student : students) {
            System.out.println(student);
        }

        
        if (students.contains("Priya")) {
            System.out.println("\nPriya is present in the list.");
        }
    }
}
