public class BasicMethod {
    static void Greet() {
        System.out.print("Hello");
    }
}

class twokatable {
    static void Table() {
        System.out.println("2");
    }
}

class Main{   
    public static void main(String[] args) {
        System.out.print("Hi");
        BasicMethod.Greet();
        twokatable.Table();
    }
}
