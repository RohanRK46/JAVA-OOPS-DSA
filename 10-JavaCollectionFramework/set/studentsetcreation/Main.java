package set.studentsetcreation;

import java.util.HashSet;
import java.util.Objects;

class Student {
    public int rollno;
    public String name;
    public int DOB;

    public Student(int rollno, String name, int DOB) {
        this.rollno = rollno;
        this.name = name;
        this.DOB = DOB;
    }

    @Override
    //
    public int hashCode() {
        return Objects.hash(rollno, name, DOB);
    }

    @Override
    // this override prints value insted of hashcode when we run
    public String toString() {
        return "student { " + "Roll No : " + rollno + " , Name : " + name + " , DOB : " + DOB + "}";
    }

    @Override
    // this forces java to check if data inside object is same or not thus making them same 
    // object and thus removing duplicates
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Student))
            return false;

        Student s = (Student) obj;

        return rollno == s.rollno &&
                DOB == s.DOB &&
                name.equals(s.name);
    }
}

public class Main {
    public static void main(String[] args) {

        HashSet<Student> Studlist = new HashSet<>();

        Student A = new Student(1, "Rohan Yadav", 13092003);
        Student B = new Student(1, "Rohan Yadav", 13092003);
        Student C = new Student(1, "Rohan Yadav", 13092003);

        Studlist.add(A);
        Studlist.add(B);
        Studlist.add(C);

        System.out.println(Studlist);
    }

}
