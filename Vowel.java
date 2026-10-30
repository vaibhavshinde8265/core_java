package practice;

class Student {

    private String name;

    Student(String name) {
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