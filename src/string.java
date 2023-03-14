import java.util.Scanner;
public class string {
    Scanner sc = new Scanner(System.in);
    String s1, s2;
    System.out.println("enter the first string: ");
    s1 = sc.nextLine();
    System.out.println("enter the second string: ");
    s2 = sc.nextLine();
    method1(s1,s2);
    method2(s1,s2);
    method3(s1,s2);

}

public static void method1(String s1, String s2) {
    if (s1.length() > s2.length()) {
        System.out.println(s1 + " has greater length than" + s2);
    } else {
        System.out.println(s1 + "does not have greater length than" + s2);
    }
}
public static void method2(String s1, String s2){
    if (s1.compareTo(s2)< 0) {
        System.out.println(s1 + "comes before" + s2);
    }
    else if(s1.compareTo(s2)==0) {
        System.out.println(s1" is equal to" + s2);
    }
    else {
        System.out.println(s1 + " comes after " + s2);
    }

    public static void method (String s1, String s2){
        System.out.println(s1 + " " + s2);
    }


    }

}

