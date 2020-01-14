package Array;
import java.util.*;
public class Reversearray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array (in Integer) n: ");
		int n=sc.nextInt();
		int[] numbers=new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter numbers["+i+"]: ");
			numbers[i] = sc.nextInt();
		}
		
		// Reverse
		int[] numbers1 = new int[n];
		int j = 0;
		for (int i = n - 1; i >= 0; i--) {
			numbers1[j] = numbers[i];
			j++;
		}
		System.out.println("::Reverse of the Array::");
		for (int i = 0; i < n; i++) {
			System.out.println("numbers1["+i+"]: ");
			System.out.println(numbers1[i]);
		}
		sc.close();
	}
}