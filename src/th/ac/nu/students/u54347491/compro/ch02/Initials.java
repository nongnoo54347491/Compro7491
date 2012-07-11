package th.ac.nu.students.u54347491.compro.ch02;



import java.util.Scanner;
public class Initials {

    
    public static void main(String[] args) {       
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        String first = in.nextLine();
        System.out.print("Enter your significant otther's first name: ");
        String second = in.nextLine();
        
        String initials = first.substring(0, 1) + "&" + second.substring(0, 1);
        System.out.print(initials);
        
    }
}
