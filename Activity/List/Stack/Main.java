package Stack_demo;

import java.util.Stack;

class Main {

    public static void main(String[] args) {

        Stack<Person> stack = new Stack<>();

        Person p1 = new Person("Lakshmi", 19);
        Person p2 = new Person("Gayathri", 22);
        Person p3 = new Person("Rahul", 27);
        Person p4 = new Person("Priya", 31);
        Person p5 = new Person("Kiran", 25);


        stack.push(p1);
        stack.push(p2);
        stack.push(p3);
        stack.push(p4);
        stack.push(p5);

        System.out.println("People with age between 20 and 30:");

        for (Person p : stack) {
            if (p.age >= 20 && p.age <= 30) {
                System.out.println(p.name + " - " + p.age);
            }
        }

        Person removed = stack.pop();

        System.out.println("\nPopped Person:");
        System.out.println(removed.name + " - " + removed.age);

        System.out.println("\nRemaining Stack:");

        for (Person p : stack) {
            System.out.println(p.name + " - " + p.age);
        }
    }
}