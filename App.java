public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        System.out.println("------------");
        Student student1 = new Student();
        student1.studentID = 123456;
        student1.name = "James";
        student1.pointTheory = 8;
        student1.pointPractice = 9;
        student1.display();
        student1.average(1);

        System.out.println("------------");
        Student student2 = new Student();
        student2.studentID = 234567;
        student2.name = "Claire";
        student2.pointTheory = 10;
        student2.pointPractice = 9;
        student2.display();
        student2.average(2);

        System.out.println("------------");
        Student student3 = new Student();
        student3.studentID = 345678;
        student3.name = "Jay";
        student3.pointTheory = 9;
        student3.pointPractice = 7;
        student3.display();
        student3.average(3);

        System.out.println("------------");
        Student student4 = new Student(456789, "Elen", 6, 8);
        student4.display();
        student4.average(4);
    }
}
