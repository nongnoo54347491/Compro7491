   package th.ac.nu.students.u54347491.compro.ch02;
    import java.util.Scanner;
    public class Homework11 {

    public static void main(String[] args) {
             
        Scanner in = new Scanner(System.in);
        final int PENNIES_PER_DOLLAR = 100;
        final int PENNIES_PER_QUARTER = 25;
        final int PENNIES_PER_DIME = 10;
        final int PENNIES_PER_NICKEL = 5;
        final int PENNIES_PER_PENNY = 1;

        System.out.println("Enter Amount Due(in Pennies):");
        int amountDue = in.nextInt();

        System.out.println("Enter Amount Recive(in Pennies):");
        int amountReceive = in.nextInt();

        int change = amountReceive - amountDue;
        int dollarCoins = change/PENNIES_PER_DOLLAR;
        change = change%PENNIES_PER_DOLLAR;
        int quarterCoins = change/PENNIES_PER_QUARTER;
        change = change%PENNIES_PER_QUARTER;
        int dimeCoins = change/PENNIES_PER_DIME;
        change = change%PENNIES_PER_DIME;
        int nickelCoins = change/PENNIES_PER_NICKEL;
        change = change%PENNIES_PER_NICKEL;
        int pennyCoins = change/PENNIES_PER_PENNY;
        change = change%PENNIES_PER_PENNY;

        System.out.println("Dollar coins: "+dollarCoins);
        System.out.println("Quarter coins: "+quarterCoins);
        System.out.println("Dime coins: "+dimeCoins);
        System.out.println("Nickel coins: "+nickelCoins);
        System.out.println("Penny coins: "+pennyCoins);
}
}
    

