import java.util.Scanner;
class SumOfNEvenNumbers{
	public static void main(String[]args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number:");
	int givenNum = scanner.nextInt();
	int sumofnevennumbers = (givenNum*(givenNum + 1));
	System.out.println("The sum of the given n even numbers:" + sumofnevennumbers );
	}
}
