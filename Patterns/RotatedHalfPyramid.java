/*
            INVERTED & ROTATED HALF-PYRAMID pattern
                        *
                       **
                      ***
                     ****
 */

 
public class RotatedHalfPyramid {

    public static void pattern(int num){
        for(int i=0; i<num; i++){
            for(int k=0; k<num-i; k++){
                System.out.print(" ");
            }

            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n =4;
        pattern(n);
    }
}

/*
    Output:

       *
      **
     ***
    ****
    
 */