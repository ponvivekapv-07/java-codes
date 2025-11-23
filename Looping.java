import java.util.Scanner;
class Looping{
	public static void main(String[]args){
	Scanner scanner = new Scanner(System.in);
	int i;
	System.out.println("Enter the number:");
	int choice = scanner.nextInt();
	switch(choice){
	case 1:
		System.out.println("Printing the numbers from 1 to 10:");
		for(i=1;i<=10;i++){
			System.out.println(i);
		}
		break;
	case 2:
		System.out.println("Printing the even numbers from 1 to 50:");
		for(i=1;i<=50;i++){
			if(i % 2 == 0){
				System.out.println(i);
			}
		}
		break;
	case 3:
		System.out.println("Printing the odd numbers from 1 to 50:");
		for(i=1;i<=50;i++){
			if(i % 2 != 0){
				System.out.println(i);
			}
		}
		break;
	case 4:
		System.out.println("Printing reverse numbers from 10 to 1:");
		for(i=10;i>=1;i--){
			System.out.println(i);
		}
		break;
	case 5:
		System.out.println("Printing My name 5 times:");
		String myName = "Ponviveka";
		for(i=1;i<=5;i++){
			System.out.println(myName);
		}
		break;
	default:
		System.out.println("Invalid choice!");
		break;
	}
	}
}
