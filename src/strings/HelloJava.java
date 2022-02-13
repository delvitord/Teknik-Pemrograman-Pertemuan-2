package strings;

public class HelloJava {
	public static void main(String[] args) {
		String myString1 = "hello";
		String myString2 = "java";
		int length1, length2, totalLength, compare;
		
		length1 = myString1.length();
		length2 = myString2.length();
		totalLength = length1 + length2;
		
		System.out.println(totalLength);
		
		compare = myString1.compareTo(myString2);
		if (compare < 0) {
			System.out.println("No");
		} else if (compare > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("Same");
		}
		
		String myString1Up = myString1.substring(0, 1).toUpperCase() + myString1.substring(1);
		String myString2Up = myString2.substring(0, 1).toUpperCase() + myString2.substring(1);
		
		System.out.println(myString1Up + " " + myString2Up);
	}
}
