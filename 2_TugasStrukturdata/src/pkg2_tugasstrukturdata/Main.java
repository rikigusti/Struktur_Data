package pkg2_tugasstrukturdata;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
       int number1, number2, results;
       float num1, num2,amount ;
       
       Scanner input = new Scanner(System.in);
        System.out.println("calculator");
        System.out.println("===========");
        System.out.println("Integers");
        System.out.print("Number one:");
        number1 = input.nextInt();
        System.out.print("Number two:");
        number2 = input.nextInt();
        
        results= number1 + number2;
        System.out.println("Results:"+results);
        
        System.out.println("===========");
        System.out.println("Decimal Numbers");
        System.out.print("Number one:");
        num1 = input.nextFloat();
        System.out.print("Number two:");
        num2 = input.nextFloat();
        
        amount= num1 + num2;
        System.out.println("Results:"+amount);
    }
    
}
