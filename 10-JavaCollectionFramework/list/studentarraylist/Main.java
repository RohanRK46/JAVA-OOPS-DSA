package list.studentarraylist;
import java.util.*;

class Student {
    public int rollNo; 
    public String Name;

    public Student(int rollNo , String Name){
        this.rollNo = rollNo;
        this.Name = Name;
    }

    public String toString(){
        return "Student { Roll No = " + rollNo +
           ", Name = " + Name + " }";
    }
}

public class Main {
    public static void main(String[] args) {
        List <Student> studlist = new ArrayList<>();
        Student A = new Student(1, "Rohan");
        Student B = new Student(2, "Bohan");
        Student C = new Student(3, "Mohan");

        studlist.add(A);
        studlist.add(B);
        studlist.add(C);

        System.out.println(studlist);
    }
}
