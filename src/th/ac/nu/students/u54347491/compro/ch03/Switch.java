
package th.ac.nu.students.u54347491.compro.ch03;
import java.util.Scanner;
public class Switch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char grade = in.next().charAt(0);
        switch (grade){
        case 'A':
            System.out.println("Excellent");
            break;
        case 'B':
            System.out.println("Good");
            break;
        case 'C':
            System.out.println("So So");
            break;
        case 'D':
            System.out.println("Fails");
            break;
        case 'F':
            System.out.println("Get lost");
            break;
        default:
            System.out.println("Invalod");
            break;
        }
    }
}
