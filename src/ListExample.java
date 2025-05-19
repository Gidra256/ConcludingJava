import java.util.Scanner;
public class ListExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many names do you want to add?");
        int numberOfNames = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        String[] names = new String[numberOfNames];
        for (int i = 0; i < numberOfNames; i++) {
            System.out.println("Enter name " + (i + 1) + ":");
            names[i] = scanner.nextLine();
        }
        System.out.println("You have entered the following names:");
        for (int i = 0; i < numberOfNames; i++) {
            System.out.println(names[i]);
        }
        scanner.close();
    }
}
