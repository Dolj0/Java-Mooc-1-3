
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String i = scanner.nextLine();
        System.out.print("Enter password: ");
        String j = scanner.nextLine();
        
        if (i.equals("alex")){
            if (j.equals("sunshine")){
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Incorrect username or password!");
            }
        } else if (i.equals("emma")){
            if (j.equals("haskell")){
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Incorrect username or password!");
            }
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
