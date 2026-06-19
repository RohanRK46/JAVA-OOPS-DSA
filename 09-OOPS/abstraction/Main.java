package abstraction;

interface Bird {

    void fly();

    void eat();

}

class Eagle implements Bird {

    @Override
    public void fly() {
        System.out.println("Eagle is flying...");
    }

    @Override
    public void eat() {
        System.out.println("Eagle is eating...");
    }

}

class Sparrow implements Bird {

    @Override
    public void fly() {
        System.out.println("Sparrow is flying...");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow is eating...");
    }

}

public class Main {

    public static void doBirdStuff(Bird a){
        a.eat();
        a.fly();
    }
    public static void main(String[] args) {
        Bird a = new Eagle();
        doBirdStuff(a);
        Bird b = new Sparrow();
        doBirdStuff(b);

    }


}