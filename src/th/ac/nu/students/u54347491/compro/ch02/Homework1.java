package th.ac.nu.students.u54347491.compro.ch02;
import java.util.Scanner;
public class Homework1 {
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter Number:");
       int input = in.nextInt();
       System.out.println("Square is "+(input*input));
       System.out.println("Cube is "+(input*input*input));
       System.out.println("Fourth Power is "+ Math.pow(input,4));        
        
    }
}
