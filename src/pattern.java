import java.util.Scanner;
public class pattern {
    public static void main(String [] args){
        int n = 6;
        for(int i =1; i<=n;i++){

            for(int s = 1; s<=n-i; s++) {
                System.out.print(" ");
            }
            for (int k = 1; k<=2*i-1; k++)
                System.out.println("*");

            }
        System.out.println();
        }

    }
}
