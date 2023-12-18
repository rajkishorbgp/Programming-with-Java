/*
                    @Program: 30
    Write a java program to create custom exception.
      
*/

public class Q30_create_custom_exception {
    public static void main(String[] args) {
        int age = 15;
        try {
            if (age < 18) {
                throw new CustomException("Age is less than 18, not eligible for voting");
            }
        } catch (CustomException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

/*
 *   output:
 *   Custom Exception caught: Age is less than 18, not eligible for voting
 */