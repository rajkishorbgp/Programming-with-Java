/*
 *   Find Subsets
 *   Find & print all subsets of a given string "abc" 
 */

public class FindSubsetsString {

    public static void printSubset(String str,String ans, int i){
        // Base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        printSubset(str,ans+str.charAt(i),i+1); // yes choice
        printSubset(str,ans,i+1);   // No choice
    }
    
    public static void main(String[] args) {
        String str="abc";
        printSubset(str,"",0);
    }
}

/*
 *   Output:
 *   abc
 *   ab
 *   ac
 *   a
 *   bc
 *   b
 *   c
 *   null
 */