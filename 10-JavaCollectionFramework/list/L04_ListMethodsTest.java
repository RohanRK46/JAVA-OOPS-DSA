package list;
import java.util.*;

class Student{
    public int rollNo;
    public String Name;

    public Student(int rollNo , String Name){
        this.Name = Name;
        this.rollNo = rollNo;
    }

    public String toString(){
        return "Student { Roll Number : " + rollNo + ", Name : " + Name + " }";
    }
}

public class L04_ListMethodsTest {
    public static void main(String[] args) {
        List <Student> studList = new ArrayList<>();
        Student A = new Student(1, "Rohan");
        Student B = new Student(2, "Aman");
        Student C = new Student(3, "Shashii");
        Student D = new Student(4, "Shampii");

        studList.add(A);
        studList.add(B);
        studList.add(C);
        studList.add(D);

        Student E = new Student(5, "Kharbuja");
        studList.add(2, E);

        System.out.println(studList);
        
    }
}