/*
 *  Find permutations
 *  
 *  Find & print all parmutations of a string. 
 */

public class FindPermutationsString {

    public static void findPermutation(String str , String ans){
         if(str.length()==0){
            System.out.println(ans);
            return;
         }

        for(int i=0; i<str.length(); i++){
            char curr=str.charAt(i);
            // ans+=str.charAt(i);
            // abc -> a+b =ab
           String newStr =str.substring(0,i)+str.substring(i+1);
            findPermutation(newStr,ans+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        findPermutation(str,"");
    }
}

/*
 *   Output:
 *   abc
 *   acb
 *   bac
 *   bca
 *   cab
 *   cba
 */