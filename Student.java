public class Student {
    public int studentID;
    public String name;
    public float pointTheory;
    public float pointPractice;

    public Student() {
        System.out.println("This is a constructor");
    }

    public Student(int studentID, String name, float pointTheory, float pointPractice) {
        this.studentID = studentID;
        this.name = name;
        this.pointTheory = pointTheory;
        this.pointPractice = pointPractice;
    }

    public void average(float score) {
        score = (pointTheory + pointPractice) /2;
        System.out.println("Average score: " + score);
    }

    public void display() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Theorical point: " + pointTheory);
        System.out.println("Practical point: " + pointPractice);
    }
}
