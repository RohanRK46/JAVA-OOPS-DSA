package basics;
public class objectcreation {
    public static void main(String[] args) {

        // object creation without value (default garbage value)
        constructorcreation A = new constructorcreation();

        // Object creation using default Ctor
        A.id = 1;
        A.name = "Rohan";
        A.age = 22;
        A.faculty = "engineering";
        // A.password = 7559 ; (we cant do this because its private we need to make a setter for that)

        System.out.println(A.id + " " + A.name + " " + A.age + " " + A.faculty);
        A.studymorethan3hr();

        // object creation in main with parameters
        constructorcreation B = new constructorcreation(2, "Himansu", 23, "Data-Science" , 1234);
        System.out.println(B.id + " " + B.name + " " + B.age + " " + B.faculty);
        B.study3hr();

        // object creation and copying value of A
        constructorcreation C = new constructorcreation(A);
        C.id = 3;
        System.out.println(C.id + " " + C.name + " " + C.age + " " + C.faculty);
    }
}
