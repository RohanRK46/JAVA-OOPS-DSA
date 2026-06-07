//Implicit coversion (this happens automatically)

public class typeConversion {
    public static void main(String[] args) {
        int a = 24;
        float b = a;
        System.out.println(((Object)b).getClass().getSimpleName());
    }
}
