package String;
public class StringMethods {

	public static void main(String[] args) {
		// Three Ways to define string
		String s1="welcome";
		String ss1="welcome";
		//same memory loction for s1 and ss1 will reference to same memory loction
		
		String s2=new String("Raj Mistry");
		
		char ch[]= {'R','A','V','I',' ','M','I','S','T','R','Y'};
		String s3=new String(ch);
		
		//Method 1. charAt(10);
		char c=s1.charAt(5);
		System.out.println(c);
		
		//Method 2. length();
		System.out.println(s3.length());
		
		//format("",object)
		System.out.println(String.format("My name is %s",s2));
		
		//substring
		System.out.println("Susting from begin index : "+s2.substring(4));
		System.out.println("Susting from begin index to end index-1 : "+s2.substring(4,7));
		
		//contains() returns true or false
		System.out.println("S2 contains Mistry: "+s2.contains("Mistry"));
		
		//join(delimiter,sequence)
		String joinString1=String.join("-","welcome","to","Myworld");  
		System.out.println(joinString1);
		
		//equlas() and isEmpty() 
		System.out.println(s1.equals(ss1));
		System.out.println(s1.equalsIgnoreCase(ss1));
		System.out.println(ss1.isEmpty());
		
		//concate 
		String str1="I am";  
		str1.concat(" inevitable...");  
		System.out.println(str1.concat(" inevitable..."));
		
		//replace
		String replaceString=s1.replace('w','k');
		System.out.println(replaceString);
	}

}
