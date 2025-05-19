class MathUtils {
    static int square(int x){
        return x*x;

    }
}

public class StaticMethod {
    public static void main(String args[]){
        int result = MathUtils.square(5);
        System.out.println("Square of 5 is: " + result);
    }
}