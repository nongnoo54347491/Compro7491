package th.ac.nu.students.u54347491.compro.ch02;


public class MaximumValue {

    
    public static void main(String[] args) {
        
        int num = 2147483647;
        System.out.println(num);//2147483647
        System.out.println(num+1);//-2147483648
        
        int num2 = -2147483648;
        System.out.println(num);//2147483648
        System.out.println(num+1);//-2147483647
    }
}
