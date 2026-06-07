public class basicsOfString {
    public static void main(String[] args) {

        // method 1 of creating string

        String str1 = "rohan";
        String str2 = "rohan";

        // System.out.println(str2.is);

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        // Same identityHashCode means both variables are referring to the same object.


        // method 2 to create string with two diffrent object
        String str3 = new String("blablabla");
        String str4 = new String("blablabla");

        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
        // these will indicate to diffrent Hashcodes
    }
    
}
