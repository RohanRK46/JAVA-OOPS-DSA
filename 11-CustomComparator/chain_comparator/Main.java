package chain_comparator;

import java.util.*;

class Students {
    public String name;
    public int age;
    public double gpa;
    
    public Students(String name , int age , double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String toString(){
        return "Student { Name : " + name + ", age : " + age + ", gpa : " + gpa + " } " ; 
    }
}

public class Main{
    public static void main(String[] args) {
        List <Students> studlist = new ArrayList<>();
        Students A = new Students("Rohan", 23, 7.1);
        Students B = new Students("Alice", 22, 8.1);
        Students C = new Students("Bisnoy", 21, 9.1);
        Students D = new Students("Danga", 23, 6.9);

        studlist.add(A);
        studlist.add(B);
        studlist.add(C);
        studlist.add(D);

        System.out.println(studlist);

        Comparator <Students> comp = Comparator 
        .comparingInt((Students a) -> a.age )
        .thenComparingDouble((Students a ) -> a.gpa)
        .thenComparing((a) -> a.name);

        System.out.println("Before Applying custom Comparator \n: " + studlist);
        studlist.sort(comp);
        System.out.println("After Applying custom Comparator \n: " + studlist);
    }
}
