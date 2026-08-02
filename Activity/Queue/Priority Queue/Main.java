package PriorityQ;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>(Collections.reverseOrder(
                (a, b) -> b.marks - a.marks));

        pq.add(new Student("Alice", 85));

        pq.offer(new Student("Bob", 92));
        pq.offer(new Student("Charlie", 78));
        pq.offer(new Student("David", 88));

        System.out.println("Priority Queue: " + pq);

        System.out.println("Size: " + pq.size());

        System.out.println("Top Student (peek): " + pq.peek());

        System.out.println("Top Student (element): " + pq.element());

        Student s = new Student("Bob", 92);
        System.out.println("Contains Bob? " + pq.contains(s));

        System.out.println("Removed: " + pq.remove());

        System.out.println("Polled: " + pq.poll());

        System.out.println("Is Queue Empty? " + pq.isEmpty());

        System.out.println("\nIterator based: ");
        Iterator I1 = pq.iterator();
        while(I1.hasNext()){
            System.out.println(I1.next());
        }

        System.out.println("Object based printing : ");
        Object[] arr = pq.toArray();
        for(Object x : arr){
            System.out.print(x+" ");
        }

        System.out.println("\nwhile loop : ");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        System.out.println("Is Queue Empty Now? " + pq.isEmpty());
    }
}