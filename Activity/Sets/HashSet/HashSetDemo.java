import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> students = new HashSet<>();

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

        HashSet<String> newStudents = new HashSet<>();
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