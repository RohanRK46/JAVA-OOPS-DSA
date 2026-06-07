public class perfectEncapsulation {
    public static void main(String[] args) {
        Banking A = new Banking( 7559 , "Rohan kumar Yadav" , 5000 );
        
        System.out.println(A.getAccountHolderName());
        A.setpin(1234);
        System.out.println(A.getpin());

        A.setpin(7559);
        System.out.println(A.getpin());
    }
}
