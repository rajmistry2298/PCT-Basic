package String;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int r,sum=0,temp;    
		  int n=969;//It is the number to be checked if it is palindrome or not  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
	}
