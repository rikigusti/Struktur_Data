package struktur_data;
import java.util.Scanner;
public class Struktur_Data {

   
    public static void main(String[] args) {
       String first, last;
       
       Scanner input = new Scanner(System.in);
        System.out.print("Fist Name :");
        first = input.nextLine();
        System.out.print("Last Name :");
        last = input.nextLine();
        System.out.println("");
        System.out.println("Full Name :" + first + last);
    }
    
}
