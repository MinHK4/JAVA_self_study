package Lesson01;
import java.util.Scanner;

public class Code02 {

	public static void main(String[] args) {
		int number = 122;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter an integer: ");
		
		int input = kb.nextInt();
		
		if(input == number) {
			System.out.println("Numbers match!");
		} else {
			System.out.println("Numbers do not match!");
		}
		
		kb.close();
	}

}
