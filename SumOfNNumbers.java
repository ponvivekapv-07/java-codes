import java.util.Scanner;
class SumOfNNumbers{
	public static void main(String[]args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number:");
	int givenNum = scanner.nextInt();
	int sumofnnumbers = (givenNum*(givenNum + 1))/2;
	System.out.println("The sum of the given n numbers:" + sumofnnumbers );
	}
}
