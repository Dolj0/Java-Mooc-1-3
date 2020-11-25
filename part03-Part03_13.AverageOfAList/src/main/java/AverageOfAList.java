
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        double j = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // toteuta listan lukujen summan laskeminen tänne
        
        for(int i=0; i<list.size(); i++) {
            j = (1.0*j) + (1.0*list.get(i));
        }
        
        double k = j/list.size();
        System.out.println("Average: " + k);
    }
}

  
