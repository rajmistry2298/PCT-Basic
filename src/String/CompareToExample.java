package String;
/**
 * The Java String compareTo() method is used for comparing two strings lexicographically.
 * Each character of both the strings is converted into a Unicode value for comparison.
 * If both the strings are equal then this method returns 0 else it returns positive or
 * negative value.The result is positive if the first string is lexicographically greater 
 * than the second string else the result would be negative.
 * @author rajmi
 *
 */
import java.util.*;
public class CompareToExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First String: ");
		String inputString1 = sc.next();
		System.out.print("Enter Second String: ");
		String inputString2 = sc.next();
		
		if(inputString1.compareTo(inputString2) > 0)
		{
			System.out.println(inputString2 + " is lexicographically smaller than "+inputString1);
		}
		else if(inputString1.compareTo(inputString2) < 0)
			System.out.println( inputString1 + " is lexicographically smaller than "+inputString2);
		else
			System.out.println("Both Strings are lexicographically equal");
	sc.close();
	}

}
