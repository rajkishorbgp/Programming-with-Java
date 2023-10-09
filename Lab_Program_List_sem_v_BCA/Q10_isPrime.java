/*
 *                       @Program: 10
 *     Write a java program to check whether a number is prime or not.
 */


 public class Q10_isPrime {
    public static Boolean isPrime(int num){
        for (int i = 2; i < num/2; i++) {
            if (num % i==0) {
                return false;
            }
        }
        return true;
    }
 
    public static void main(String[] args) {
        int num = 23;
        if (isPrime(num)) {
            System.out.println("Number is prime.!");
        }else{
            System.out.println("Number is not prime.!");
        }
    }
 }

 /*
  *   Output:
  *   Number is prime.!
  */