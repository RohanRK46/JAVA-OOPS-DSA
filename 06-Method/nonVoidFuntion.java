class add {
    static int addtwonumber(int a, int b){
        int sum = a + b; 
        return sum;
    }
} 

public class nonVoidFuntion {
public static void main( String [] args ) {
    int result = add.addtwonumber(15,20);
    System.out.println(result);
    }
}