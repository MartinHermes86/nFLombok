package co.github.martinhermes86;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1, "John Doe", 24, "123 Main St", "A");
        Student student2 = new Student(2, "Jane Doe", 21, "456 Elm St", "B-");
        Student student3 = new Student(3, "John Smith", 34, "789 Oak St", "C+");
        Student student4 = new Student(4, "Jane Smith", 19, "101 Pine St", "A-");

        Teacher teacher = new Teacher(1, "Mr. Gandalf", "Fireworks");

        Course course = new Course(1, "Algebra", teacher, Arrays.asList(student1, student2));

        // Test Lombok generated methods
        System.out.println(student1);
        System.out.println(teacher);
        System.out.println(course);

        // Check if getters and setters work
        student1.setName("John Smith");
        System.out.println("Updated student name: " + student1.getName());
        student2.setAge(34);
        System.out.println("Updated student age: " + student2.getAge());
        student3.setGrade("C");
        System.out.println("Updated student grade: " + student3.getGrade());
        student4.setAddress("321 Main St");
        System.out.println("Updated student address: " + student4.getAddress());

        Student student5 = Student.builder()
                .id(5)
                .name("Micheal Scofield")
                .age(18)
                .address("Fox-River-State")
                .grade("D-")
                .build();

        Teacher teacher1 = Teacher.builder()
                .id(1)
                .name("Mr. Smith")
                .subject("Mathematics")
                .build();

        Course course1 = Course.builder()
                .id(1)
                .name("Algebra")
                .teacher(teacher)
                .students(Arrays.asList(student1, student2))
                .build();

        System.out.println(teacher1);
        System.out.println(course1);
        System.out.println(student5);
    }
}