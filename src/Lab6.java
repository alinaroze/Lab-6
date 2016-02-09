/**
 * Lab6: Complete the recursive method isaPalindrome
 *
 */

import java.util.Scanner;

public class Lab6{


    public static void main(String[] args){
	/******************************************************** Palindrome */
	if (!isaPalindrome("satanoscillatemymetallicsonatas"))
	    System.out.println("You have a bug in your code!");
	else
	    System.out.println("check for palidrome ok");
			    
	Scanner console = new Scanner(System.in);
	System.out.print("Input a string\n>");
	String line = console.nextLine();
	while (!line.equals("")){
	    if (isaPalindrome(line))
		System.out.println(line+ "is a palindrome");
	    else
		System.out.println(line+ "is *not* a palindrome");
	    System.out.print("Input a string\n >");
	    line = console.nextLine();
	}
    }

    /** method to determine whether the specified string is a palindrome
     * @param expr string 
     * @return true if the specified string is a palindrome, otherwise false.
     */
    public static boolean isaPalindrome(String expr){
	// TO COMPLETE
    }

}
