package bitoperatorquestions;

public class LastSetBit {
    public static void main(String[] args) {
        int num = 7;
        int lastSetBit = num & -num;
        System.out.println(lastSetBit);
    }
}
