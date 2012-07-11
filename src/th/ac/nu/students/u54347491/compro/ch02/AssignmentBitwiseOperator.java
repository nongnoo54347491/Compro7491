package th.ac.nu.students.u54347491.compro.ch02;


public class AssignmentBitwiseOperator {

    public static void main(String[] args) {
        
        int x = 7;
        System.out.println("x = " + Integer.toBinaryString(x));//111
        System.out.println("x <<= 1 = " + Integer.toBinaryString(x <<= 1));//1110
        System.out.println("x <<= 1 = " + Integer.toBinaryString(x <<= 1));//11100
        System.out.println("x <<= 1 = " + Integer.toBinaryString(x <<= 1));//111000
        
        x = 7;
        System.out.println("x = " + Integer.toBinaryString(x));//111
        System.out.println("x >>= 1 = " + Integer.toBinaryString(x >>= 1));//11
        System.out.println("x >>= 1 = " + Integer.toBinaryString(x >>= 1));//1
        System.out.println("x >>= 1 = " + Integer.toBinaryString(x >>= 1));//0
        
    }
}
