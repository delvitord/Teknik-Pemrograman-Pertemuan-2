package datatypes;
import java.util.Scanner;

public class DataTypes {
	public static void main(String[] args) {
		int numberCases;
		long dataChecked;
		
		Scanner keyboard = new Scanner(System.in);
		
		numberCases = keyboard.nextInt();
		String[] numbers = new String[numberCases];
		
		keyboard.nextLine();
	
		for (int i = 0; i < numberCases; i++) {
			numbers[i] = keyboard.nextLine(); 
		}
		
		keyboard.close();
		
		for (int i = 0; i < numberCases; i++) {
			try {
				dataChecked = Long.parseLong(numbers[i]);
				if (dataChecked >= -32768  && dataChecked <= 32767) {
					System.out.println(numbers[i] + " can be fitted in:");
					System.out.println("* short\n* int\n* long\n");
				} else if (dataChecked >= -2147483648  && dataChecked <= 2147483647) {
					System.out.println(numbers[i] + " can be fitted in:");
					System.out.println("* int\n* long\n");
				} else {
					System.out.println(numbers[i] + " can be fitted in:");
					System.out.println("* long\n");
				}
			}catch(Exception e) {
	            System.out.println(numbers[i] + " can't be fitted anywhere.\n");
			}
			
		}
		
	}
}
