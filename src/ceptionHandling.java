public class ceptionHandling {
   public static void CheckAge(int age){
        if (age < 18) {
            throw new ArithmeticException("You are still young");
        }else{
            System.out.println("You are an adult Access Granted");
        }
    }
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]); // This will cause an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
        try {
            String str = null;
            System.out.println(str.length()); // This will cause a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
        try {
            int result = 10 / 0; // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
        //Throwing Exceptions directly 
        CheckAge(15);
    }
}
 