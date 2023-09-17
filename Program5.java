import java.util.*;
class Program5{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number1:");
		int num1=sc.nextInt();
		System.out.println("Enter number2:");
		int num2=sc.nextInt();
		num1 = num1+ num2;
		num2= num1 - num2;
        num1= num1 - num2;
		System.out.println("Numbers after swap: number1 = " + num1 + " and number2 = " + num2);

    }




}