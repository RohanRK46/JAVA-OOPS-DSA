// Explic conversion ( this doesnot take place automatically ) 

public class typeConversion2 {
    public static void main(String[] args) {
        float a = 24.33f;
        int b = (int)a; // b which contains value of a is now integer
        System.out.println(((Object)b).getClass().getSimpleName());
    }
}
