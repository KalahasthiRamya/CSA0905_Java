import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> customers = new LinkedList<>();

        customers.add("Rahul");
        customers.add("Priya");
        customers.add("Arun");
        customers.add("Sneha");

        System.out.println("Customer Queue: " + customers);

        System.out.println("First Customer: " + customers.peek());
        
        customers.remove();

        System.out.println("After serving one customer:");
        System.out.println(customers);

        customers.add("Kiran");

        System.out.println("After adding Kiran:");
        System.out.println(customers);
    }
}