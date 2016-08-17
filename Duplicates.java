import java.util.Scanner;


public class Duplicates {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	StringBuffer s=new StringBuffer(sc.next());
	int i=0,j=0;
	for(i=0;i<s.length();i++)
	{
	  for(j=0;j<s.length();j++)	
	  {
		  if(s.charAt(i)==s.charAt(j))
		  {
			s.deleteCharAt(j);  
		  }
	  }
	}
	System.out.println(s);

	}

}
