package maliha_P1;


import java.util.Scanner;


public class maliha_P1 {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter 4 digit integer");
		String number =scnr.nextLine();
		System.out.println("Encrypted");
		String encryptedNumber = encrypted(number);

		System.out.println("Decrypted");
		String DecryptedNumber = Decrypted(number);
		int number1 = 0;
		
		System.out.println("Thank you");
		
		System.out.println("You entered:" + number1);
		
	}

}
