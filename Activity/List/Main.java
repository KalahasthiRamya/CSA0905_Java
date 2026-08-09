import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<>();

        students.add("Rahul");
        students.add("Priya");
        students.add("Arun");
        students.add("Sneha");

        System.out.println("Student List:");
        for (String student : students) {
            System.out.println(student);
        }

        students.addFirst("Kiran");

        students.addLast("Meena");

        System.out.println("\nAfter adding students:");
        System.out.println(students);

        students.remove("Arun");

        System.out.println("\nAfter removing Arun:");
        System.out.println(students);
        
        if (students.contains("Priya")) {
            System.out.println("\nPriya is present in the list.");
        }
    }
}