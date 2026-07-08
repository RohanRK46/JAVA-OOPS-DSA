package comparator_comparing_method;

import java.util.*;

class Student {
    public String name;
    public int age;
    public double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String toString() {
        return "Student { Name : " + name + ", age : " + age + ", gpa : " + gpa + " } ";
    }

}

public class Main {
    public static void main(String[] args) {
        List <Student> studlist = new ArrayList<>();
        Student C = new Student("Shampi", 23, 7.1);
        Student A = new Student("Rohan", 24, 6.1);
        Student B = new Student("Hemant", 21, 9.1);

        studlist.add(A);
        studlist.add(B);
        studlist.add(C);

        // reversed() for descending else without it for ascending

        // comparing Alphabetically
        // studlist.sort(Comparator.comparing((Student a) -> a.name));
        // studlist.sort(Comparator.comparing((Student a) -> a.name).reversed);

        // based on age
        // studlist.sort(Comparator.comparingInt((Student a) -> a.age));
        // studlist.sort(Comparator.comparingInt((Student a) -> a.age).reversed());

        // based on Gpa
        // studlist.sort(Comparator.comparingDouble((Student a) -> a.gpa));
        studlist.sort(Comparator.comparingDouble((Student a) -> a.gpa).reversed());


        System.out.println(studlist);

    }

}
