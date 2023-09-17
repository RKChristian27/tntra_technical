import java.util.Scanner;

public class Program1{

	public static int countCharacter(String str, char target) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }
     public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
			System.out.print("Enter a string: ");
	        String input = sc.nextLine();
	        System.out.print("Enter a character to count: ");
	        char targetChar = sc.next().charAt(0);
			int count = countCharacter(input, targetChar);
			System.out.println("Count character '" + targetChar + "' in the string: " + count);
    }
}
