import java.util.Scanner;
public class studentgrade2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println ("Enter Student grades as you like. Eneter a character to stop.");

        int grade = input.nextInt();
        double minGrade = Double.MAX_VALUE;
        double maxGrade = Double.MIN_VALUE;

        while (!Character.isDigit(grade)) {
            if (grade == 0) {
                break;
            }
            if (grade < minGrade) {
                minGrade = grade;
            }
            if (grade > maxGrade) ;
            {
                maxGrade = grade;
            }
            try {
                grade = input.nextInt();
            }2
            catch (Exception ex); {
                break;
            }
        }
        System.out.println("The highest grade is: " + maxGrade);
        System.out.println("The lowest grade is: " +minGrade);

            }
        }


