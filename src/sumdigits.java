import java.util.Scanner;
public class sumdigits {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int n = in.nextInt();
        System.out.println("\n the sum of the digits is: "+ sumdigits(n));

        public static int sumdigits(int val){
            int sum = 0;
            while (val!=0) {
                sum = sum + val % 10;
                val = val/10;
            }
            return sum;
        }

    }
}
