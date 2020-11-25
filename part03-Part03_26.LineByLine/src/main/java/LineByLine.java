
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        String i = scanner.nextLine();
        
        while(!(i.equals(""))){

            String[] p = i.split(" ");
         
            for (int k = 0; k<p.length; k++){
                System.out.println(p[k]);
            }
            i = scanner.nextLine();
        }
    }     
}
