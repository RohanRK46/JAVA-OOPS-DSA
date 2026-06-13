package basics;
public class objectcreation {
    public static void main(String[] args) {

        // object creation without value (default garbage value)
        Student A = new Student();

        // Object creation using default Ctor
        A.id = 1;
        A.name = "Rohan";
        A.age = 22;
        A.faculty = "engineering";

        System.out.println(A.id + " " + A.name + " " + A.age + " " + A.faculty);
        A.studymorethan3hr();

        // object creation in main with parameters
        Student B = new Student(2, "Himansu", 23, "Data-Science");
        System.out.println(B.id + " " + B.name + " " + B.age + " " + B.faculty);
        B.study3hr();

        // object creation and copying value of A
        Student C = new Student(A);
        C.id = 3;
        System.out.println(C.id + " " + C.name + " " + C.age + " " + C.faculty);
    }
}
