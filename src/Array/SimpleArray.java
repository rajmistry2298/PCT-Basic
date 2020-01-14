package Array;
import java.util.Scanner;
public class SimpleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		Scanner sc = new Scanner(System.in);
		System.out.println("hey buddy!!!");
		String strArray[]= new String[n];
		strArray[0]="abc";
		for(int i=0;i<n;i++)
		{
			System.out.println("enter array element : A["+i+"] : ");
			strArray[i]= sc.nextLine();
		}
		for(int j=0;j<n;j++)
		{
			System.out.println("A["+j+"] : "+strArray[j]);
		}
		//integer Array
		int intArray[];
		intArray= new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter array element : B["+i+"] : ");
			intArray[i]= sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			System.out.println("B["+j+"] : "+intArray[j]);
		}
		
		System.out.println("Enter String-1 to convert it into number: ");
		String n1= sc.next();
		System.out.println("Enter String-2 to convert it into number: ");
		String n2= sc.next();
		
		int nn1= Integer.parseInt(n1);
		int nn2= Integer.parseInt(n2);
		int sum= nn1+nn2;
		System.out.println("Sum of 2 digits converted to int from string is : "+sum);
	sc.close();
	}

}
