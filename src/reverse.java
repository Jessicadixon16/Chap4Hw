import java.util.Scanner;
public class reverse {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = scanner.nextLine();
        String reveresedString = reverse(str);
        System.out.println("Reveresed: "+reversedString);
        if(str.equals(reveresedString)){
            System.out.println("String and its reverse are equal");
            else{
                System.out.println("String and its reverse not equal");
            }
        }
    }

    public static String reverse(String str){
        if (str.length() == 0) {
            return;
        }
        else{
            return str.charAt(str.length()-1)+reverse(str.substring(0,str.length()-1));
        }
    }
}
