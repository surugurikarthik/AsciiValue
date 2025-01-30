import java.util.Scanner;
public class Asciivalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character:");
        String ch = sc.nextLine();
        int ascii = ch.charAt(0);
    
        System.err.println("The ascii value of " + ch   + " is: " + ascii);
        sc.close();




        
    }
    
}
