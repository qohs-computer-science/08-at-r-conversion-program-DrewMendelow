/*
 * Drew Mendelow
 * 9/17/2024
 * pd 7
 * asks user for number and converts it from decimal to binary or other way
 */
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean run = true;
		while (run){
			int answer = 0;
			System.out.println("Welcome!  You have the following options:\n1. Binary to Decimal\n2. Decimal to Binary");
			while (answer != 1 && answer != 2){
				System.out.println("Which type of conversion would you like to perform?");
				answer = input.nextInt();
				input.nextLine();
			}//end while

			if (answer == 1){
				System.out.println("What is the binary number?");
				int binary = input.nextInt();
				input.nextLine();

				int power =  0;
				int decimal = 0;
				while (binary > 0){
					if (binary % 10 == 1){
						decimal += Math.pow(2, power);
					}//end if
					binary /= 10;
					power++;
				}//end while
				System.out.println("The decimal equivalent is: " + decimal);
			}//end if
			else{
				System.out.println("What is the decimal number?");
				int decimal = input.nextInt();
				input.nextLine();

				String binary = "";
				while (decimal > 0){
					binary = (decimal % 2) + binary;
					decimal /= 2;
				}//end while
				System.out.println("The binary equivalent is: " + binary);
			}//end else

			System.out.println("Do you want to continue - yes or no?");
			
			String ans = input.nextLine().trim().toLowerCase();

			if (ans.equals("yes")){
				run = true;
				System.out.println("\n\n");
			}//end if
			else{
				run = false;
			}//end else
		}//end while
		input.close();
	}//end main
}//end class
