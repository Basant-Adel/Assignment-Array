package assignmentArray2;

public class AssignmentArray2 {
    public static void main (String[] args){
        System.out.println("Hello and welcome in our school!");

        Student student1 = new Student("Basant", 20, 3.9);
        Student student2 = new Student("Hamed", 22, 2.5);

        student1.displayInfo();
        student1.study();

        student2.displayInfo();
        student2.study();

        student1.setName("Basant Adel");
        student1.setGpa(3.8);
        student1.setAge(21);

        System.out.println("Data after updates :-");
        student1.displayInfo();
    }
}
