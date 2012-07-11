package th.ac.nu.students.u54347491.compro.ch02;


public class ArthmeticAssignmentOperator {

    
    public static void main(String[] args) {
       
        int x = 1;
        x += 1;
        System.out.println(x);//2
        x *= 2;
        System.out.println(x);//4
        x -= 3;
        System.out.println(x);//1
        x /= 4;
        System.out.println(x);//0
        
        float y = 1f;
        y += 1;
        System.out.println(x);//2.0
        y *= 2;
        System.out.println(x);//4.0
        y -= 3;
        System.out.println(x);//1.0
        y /= 4;
        System.out.println(x);//0.25
    }
}
