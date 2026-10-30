package practice;

public class Student1 {
	private String name;

    Student1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student s = new Student("vaibhav");
        System.out.println(s.getName());
    }

}
