// package abstraction;

// abstract class Birds_outdated{

//     public abstract void birdfly();
    
//     protected abstract void birdEat();
    
// }

// class Eagle extends Birds_outdated{

//     @Override
//     public void birdEat() {
//         System.out.println("Eagle is eating in another way ");   
//     }

//     @Override
//     public void birdfly(){
//         System.out.println("Eagle is flying");
//     }
// }

// public class MainOutdated {
//     public static void main(String[] args) {
//         Birds_outdated a = new Eagle();
//         dobirdstuff(a);
//     }

//     public static void dobirdstuff(Birds_outdated a){
//         a.birdEat();
//         a.birdfly();
//     }
// }