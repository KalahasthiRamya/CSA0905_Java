import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {

        ArrayDeque<String> queue = new ArrayDeque<>();

        queue.add("Rahul");
        queue.add("Priya");
        queue.add("Arun");
        queue.add("Sneha");

        System.out.println("Queue: " + queue);

        queue.addFirst("Kiran");

        queue.addLast("Meena");

        System.out.println("After adding: " + queue);

        queue.removeFirst();

        queue.removeLast();

        System.out.println("After removing: " + queue);

        System.out.println("First person: " + queue.peekFirst());

        System.out.println("Last person: " + queue.peekLast());
    }
}