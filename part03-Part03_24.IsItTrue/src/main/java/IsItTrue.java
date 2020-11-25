
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give a string: ");
        String i = scanner.nextLine();
        String j = "true";
        
        if (j.equals(i)) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }

    }
}
