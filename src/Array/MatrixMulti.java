package Array;
import java.util.Scanner;
public class MatrixMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int mat1[][]=new int[3][3];
     int mat2[][]=new int[3][3];
     int ans[][]=new int[3][3];
     Scanner sc=new Scanner(System.in);
     
     //input values
     for(int i=0;i<3;i++) {
    	 for(int j=0;j<3;j++) {
    		 System.out.println("Enter mat1["+i+"]["+j+"] : ");
    		 mat1[i][j]= sc.nextInt();
    	 }
     }
     for(int i=0;i<3;i++) {
    	 for(int j=0;j<3;j++) {
    		 System.out.println("Enter mat2["+i+"]["+j+"] : ");
    		 mat2[i][j]= sc.nextInt();
    	 }
     }
     
     System.out.println("Matrix 1 is :");
     for(int i=0;i<3;i++) {
    	 for(int j=0;j<3;j++) {
    		 System.out.print(mat1[i][j]+"   ");
    	 }
    	 System.out.println("\n");
     }
     
     System.out.println("\nMatrix 2 is :");
     for(int i=0;i<3;i++) {
    	 for(int j=0;j<3;j++) {
    		 System.out.print(mat2[i][j]+"   ");
    	 }
    	 System.out.println("\n");
     }
     
     //Multiplication
     for(int i=0;i<3;i++) {
    	 for(int j=0;j<3;j++) {
    		ans[i][j]=0;
    		for(int k=0;k<3;k++) {
    			ans[i][j]+=mat1[i][k]*mat2[k][j];
    		}
    	 }
     }
     
     System.out.println("\nMatrix Multiplication is :");
     for(int i=0;i<3;i++) {
    	 for(int j=0;j<3;j++) {
    		 System.out.print(ans[i][j]+"   ");
    	 }
    	 System.out.println("\n");
     }
     sc.close();
	}
}
