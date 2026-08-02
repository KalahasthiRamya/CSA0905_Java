import java.util.*;

public class Main{
    public static void main(String[] args){
        List<Student> stuList = new Vector<>();

        Student s1 = new Student("Ram",111 , 98,67,89);
        Student s2 = new Student("Shiv",112,95,73,82);
        Student s3 = new Student("Vishnu",113,97,71,92);
        Student s4 = new Student("Raghav",114,99,65,78);
        Student s5 = new Student("Ashok",115,90,82,95);

        stuList.add(s1);
        stuList.add(s2);
        stuList.add(s3);
        stuList.add(s4);
        stuList.add(s5);

        int max = stuList.get(0).getMarks()[0];
        for(Student s : stuList){
            if (s.getMarks()[0] > max) {
                max = s.getMarks()[1];
            }

            System.out.println("Name : "+s.getName());
            System.out.println("RegNo : "+s.getRegNo());
            System.out.println("Marks : "+Arrays.toString(s.getMarks()));
            System.out.println("Average Marks : "+s.getAvg());
            System.out.println();
        }

        System.out.println("Max mark in sub1 : "+max);
    }
}