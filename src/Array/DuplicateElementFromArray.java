package Array;
import java.util.*;
public class DuplicateElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1,3,4,4,2,6,5,2 };
		//1,2,2,3,4,4,5,6
		Arrays.sort(array);
		int k = 0;
		int[] newArray = new int[array.length];
		/**
		 * this will check pairwise that both elements are same or not if not then added to new array
		 * otherwise skipped until different element come and added in new array.
		 */
		for (int i = 0; i < array.length-1; i++) {

			if (array[i] != array[i+1]) {
				newArray[k]=array[i];
				k++;
			}
			
		}
		/**
		 * this is for the last distinct element here 2 possibilities are there
		 * 1. last pair has same element -in this last loop skip it and this code will add it
		 * 2.last 2 are different - in this case 2nd last element will be added by previous loop and
		 *                          last element will not be added in new array so this code will add
		 *                          it to new array. 
		 */
		newArray[k]=array[array.length-1];
		k++;
		
		for (int i = 0; i < k; i++) {
			System.out.println(newArray[i]);
		}
	}

}
