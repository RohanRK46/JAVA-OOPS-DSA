// how stack flow is wroking here ?
// first JVM finds entry point it goes in 
// 1 --> main() 
// executes hey1
// 2 --> multiplcation() gets called with value stored in a , with variable 5
// executes hey 2 
// return value 50 and gives output
// 3 --> enters in 

class print12katable{
    static void table(){
        for(int i = 1 ; i <= 10 ; i++ ){
            System.out.println( 12 * i);
        }
    }
}

class multiplication{
    static int sum(int a) {
        System.out.println("Hey2");
        int ans = a * 10;   
        return ans;
    }
}

public class CheckingStackflow {
 public static void main(String[] args) {
    int a = 5; //here value of a = 5 
    System.out.println("hey1");
    a = multiplication.sum(5);
    System.out.println(a); // this should print 50 because value of a is updated in multiplication method
    print12katable.table();
 }   
}