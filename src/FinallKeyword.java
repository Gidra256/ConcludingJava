public class FinallKeyword {
    final int x = 10; // final variable

    public static void main(String args[]){
        FinallKeyword obj = new FinallKeyword();
        System.out.println("Value of x: " + obj.x);
        // obj.x = 20; // This will cause a compilation error
    }
}
