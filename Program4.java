import java.util.*;
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
      	String str1 = sc.nextLine();
        Scanner scc = new Scanner(System.in);
		System.out.println("Enter a string:");
      	String str2 = scc.nextLine();

        System.out.println("Strings before swap: String1 = " + str1 + " and String2 = " + str2);

        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("Strings after swap: String1 = " + str1 + " and String2 = " + str2);
    }
}