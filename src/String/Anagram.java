package String;
/**
 * Anagram means a word, phrase, or name formed by 
 * rearranging the letters of another, such as cinema,
 * formed from iceman.
 * 
 */
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First String:  ");
		String inputString1 = sc.next();
		System.out.print("Enter Second String:  ");
		String inputString2 = sc.next();
		
		//Logic for Anagram
		char[] inputArray1 = inputString1.toCharArray();
		char[] inputArray2 = inputString2.toCharArray();
		
		Arrays.sort(inputArray1);
		Arrays.sort(inputArray2);
		
		String outputString1 = new String(inputArray1);
		String outputString2 = new String(inputArray2);
		
		if(inputString1.length() == inputString2.length() && outputString1.equals(outputString2))
		{
			System.out.println("Both Strings are Anagram.");
		}
		else
		{
			System.out.println("Both Strings are not Anagram....!");
		}
 		sc.close();
	}
}