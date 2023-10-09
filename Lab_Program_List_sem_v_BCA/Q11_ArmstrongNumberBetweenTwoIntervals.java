/*
 *                            @Program: 11
 *    Write a java program to display Armstrong number between two intervals.
 */

public class Q11_ArmstrongNumberBetweenTwoIntervals { 
    public static Boolean isArmstrong(int num){
        int count = 0;
        int temp = num;
        int revSum=0;
        count = Integer.toString(temp).length();
        while (temp!=0) {
            int r = temp%10;
            revSum+= Math.pow(r, count);
            temp /=10;
        }
        if (revSum==num) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int a = 100;
        int b = 500;
        System.out.println("Armstrong number between two intervals.!");
        for (int i = a; i < b; i++) {
            if (isArmstrong(i)) {
                System.out.print(i+" ");
            }
        }
    }
}

/*
 *  Output:
 *  Armstrong number between two intervals.!
 *  153 370 371 407
 */