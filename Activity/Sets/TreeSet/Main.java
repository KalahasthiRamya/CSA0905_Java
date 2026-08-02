package Tree_Set;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        TreeSet<Student> ts = new TreeSet<>(Collections.reverseOrder((a,b)->Integer.compare(b.marks,a.marks)));

        ts.add(new Student("Alice", 85));

        ts.add(new Student("Bob", 92));
        ts.add(new Student("Charlie", 78));
        ts.add(new Student("David", 88));



        System.out.println("Size: " + ts.size());

        double sum = 0;

        System.out.println("\nIterator based: ");
        Iterator I1 = ts.iterator();
        while(I1.hasNext()){
            System.out.println(I1.next());
        }

        Student m = ts.first();
        System.out.println(m);

        System.out.println("Object based printing : ");
        Object[] arr = ts.toArray();
        for(Object x : arr){
            System.out.print(x+" ");
        }

    }
}