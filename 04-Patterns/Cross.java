//   C1C2C3C4C5
// R1 * _ _ _ *
// R2 _ * _ * _
// R3 _ _ * _ _     
// R4 _ * _ * _
// R5 * _ _ _ *

public class Cross {
    public static void main(String[] args) {
        for(int row = 1 ; row <= 5 ; row++){
            for(int column = 1 ; column <= 5 ; column++){
                if( row == column || row + column == 6 ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
