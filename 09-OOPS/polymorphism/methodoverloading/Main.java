package polymorphism.methodoverloading;

class calc {
    public int addnum(int a, int b) {
        return a + b;
    }

    public int addnum(int a, int b, int c) {
        return a + b + c;
    }

    public double addnum(int a, int b, float c) {
        return a + b + c;
    }

    // type here is different but parameter is same as above
    public int addnum(int a, int b, double c) {
        int newc = (int) c;
        return a + b + newc;
    }

}

public class Main {
    public static void main(String[] args) {
        calc c = new calc();

        // java will aut
        System.out.println(c.addnum(2, 3));
        System.out.println(c.addnum(2, 2, 2));
        System.out.println(c.addnum(2, 3, 4.5));
    }
}