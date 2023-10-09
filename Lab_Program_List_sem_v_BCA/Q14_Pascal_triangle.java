/*
 *                      @Program: 14
 *     Write a java program to print Pascal triangle.
 */

public class Q14_Pascal_triangle {
    public static void main(String[] args) {
        int n=5;
        int c=0;
        for (int i=0; i<n; i++){
            for(int j=1; j<n-i; j++ ){
              System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
               if (j==0){
		    	    c=1;
                    System.out.print(c+" ");
               }else{
                    c=c*(i-j+1)/j; 
		            System.out.print(c+" ");
		        }
            }
            System.out.println();		 
        }
    }
}

/*

Output:
    1 
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1 

*/