package assignmentArray2;

public class Student {

    private String name;
    private int age;
    private double gpa;

    public Student(String name,int age,double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void displayInfo() {
        System.out.println("Student name : " + getName());
        System.out.println("Age is : " + getAge() + " years old");
        System.out.println("GPA is : " + getGpa());
        System.out.println("------------------------");
    }

    public void study() {
        if (gpa >= 3.0){
            System.out.println(getName() + " is studying hard.");
        } else {
            System.out.println(getName() + ", You need to study hard.");
        }
        System.out.println("------------------------");
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getGpa(){
        return gpa;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("This field is required and cannot be empty");
        }
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be a positive number.");
        }
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("GPA must be between 0.0 and 4.0.");
        }
    }
}
