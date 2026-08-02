public class Student {
    private String name;
    private int regNo;
    private int[] marks = new int[3];

    public Student(String name, int regNo , int m1 , int m2 , int m3) {
        this.name = name;
        this.regNo = regNo;
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }
    public int[] getMarks(){
        return marks;
    }

    public double getAvg(){
        double avg;
        double sum = 0;
        for(int i = 0;i<marks.length;i++){
            sum += marks[i];
        }

        avg = sum / marks.length;
        return avg;
    }
}