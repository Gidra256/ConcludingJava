class Counter{
    static int count = 0; // static variable
   Counter() {
      count++;
      System.err.println("count is " + count);
   }
}

class StaticFinalAndAccessModifiers {
   public static void main(String args[]) {
      Counter c1 = new Counter();
      Counter c2 = new Counter();
      Counter c3 = new Counter();
      System.out.println("Total objects created: " + Counter.count);
   }
}