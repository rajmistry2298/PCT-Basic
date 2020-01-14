package Array;
import java.util.*;
public class EvenOdd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Main Array (in Integer) n: ");
		int n=sc.nextInt();
		int[] numbers=new int[n];
		int evenLength=0;
		int oddLength=0;
		
		for(int a=0;a<n;a++) {
			System.out.println("Enter numbers["+a+"]: ");
			numbers[a]=sc.nextInt();
		}
		/**
		 * For using Arrays for evenArray And oddArray directly will not be good idea because 
		 * we don't know what will be size of both array thats why we used list first. 
		 */
		List<Integer> oddList=new ArrayList<>();
		List<Integer> evenList=new ArrayList<>();
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i] % 2 == 0) {
				evenList.add(numbers[i]);
				evenLength++;
			}
			else {
				oddList.add(numbers[i]);
				oddLength++;
			}
		}
		
		System.out.println("Even List is:"+evenList);
		System.out.println("Odd List is:"+oddList);
		
		/**
		 * Now To get Array of even and odd elements we will copy list values to Arrays
		 */
		int[] evenArray=new int[evenLength];
		int[] oddArray=new int[oddLength];
		
		for(int k=0;k<evenLength;k++) {
			evenArray[k]=evenList.get(k);
		}
		for(int l=0;l<oddLength;l++) {
			oddArray[l]=oddList.get(l);
		}

		System.out.println("Even Elements Array:");
		for(int k=0;k<evenLength;k++) {
			System.out.println(evenArray[k]);
		}
		
		System.out.println("Odd Elements Array:");
		for(int k=0;k<oddLength;k++) {
			System.out.println(oddArray[k]);
		}
	sc.close();
	}
}
