

import java.util.InputMismatchException;
import java.util.Scanner;
public class studentgrade {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        while (true) {
            double temp = 0;
            try {
                temp = sc.nextDouble();
            } catch (InputMismatchException e) {
                break;
            }
            sum = sum + temp;
            count += 1;
        }
        double avg = (double)((double)sum/(double)count);
        System.out.println("Average student grade is "+avg);
            }
        }


