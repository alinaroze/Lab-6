
import java.util.Arrays;
import java.util.Scanner;

/**
 * Lab6: Complete the recursive method isaPalindrome
 * 
 * @author Alina Rozenbaum
 *
 */
public class Lab6 {

	public static void main(String[] args) {

		if (!isaPalindrome("satanoscillatemymetallicsonatas"))
			System.out.println("You have a bug in your code!");
		else
			System.out.println("check for palidrome ok");

		Scanner console = new Scanner(System.in);
		System.out.print("Input a string\n>");
		String line = console.nextLine();
		
		//While there is an input the program checks for a palindrome
		while (!line.equals("")) {
			if (isaPalindrome(line))
				System.out.println(line + " is a palindrome");
			else
				System.out.println(line + " is *not* a palindrome");
			System.out.print("Input a string\n >");
			line = console.nextLine();
		}
	}

	/**
	 * Method to determine whether the specified string is a palindrome
	 * 
	 * @param expr
	 *            - The word to be checked
	 * @return -True if the specified string is a palindrome, otherwise false.
	 */
	public static boolean isaPalindrome(String expr) {
		char[] word = expr.toCharArray();

		char[] half1 = Arrays.copyOfRange(word, 0, word.length / 2);
		// String word1 = new String(half1);
		// System.out.print(word1);

		char[] half2 = Arrays.copyOfRange(word, word.length / 2 + 1, word.length);
		// String word2 = new String(half2);
		// System.out.print(word2);
		int size = half2.length;

		boolean flag = false;
		char[] temp = new char[size];// Temp array for flipped half

		// Flips the second half of the word
		for (int i = 0; i < size; i++) {
			temp[i] = half2[size - 1 - i];
		}

		half2 = temp;// Original 2nd half changed to flipped array
		String flipped = new String(half2);
		// System.out.print(flipped);

		// Checks if both halves are the same
		for (int i = 0; i < size; i++) {
			if (half1[i] == half2[i]) {
				flag = true;
			} else {
				flag = false;
				return flag;
			}
		}

		return flag;

	}

}
