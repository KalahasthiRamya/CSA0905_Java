import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<String> students = new LinkedHashSet<>();

        students.add("Rahul");
        students.add("Priya");
        students.add("Arun");
        students.add("Sneha");
        
        students.add("Rahul");

        System.out.println("Students: " + students);

        System.out.println("Number of students: " + students.size());

        System.out.println("Is Priya present? "
                + students.contains("Priya"));

        System.out.println("Is student list empty? "
                + students.isEmpty());

        students.remove("Arun");
        System.out.println("After removing Arun: " + students);

        LinkedHashSet<String> newStudents = new LinkedHashSet<>();
        newStudents.add("Kiran");
        newStudents.add("Meena");

        students.addAll(newStudents);
        System.out.println("After adding new students: " + students);

        System.out.println("Contains Kiran and Meena? "
                + students.containsAll(newStudents));

        students.removeAll(newStudents);
        System.out.println("After removing new students: " + students);

        students.clear();
        System.out.println("After clear(): " + students);

        System.out.println("Is student list empty? "
                + students.isEmpty());
    }
}