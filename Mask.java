import java.util.Scanner;


public class Mask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer s1=new StringBuffer(sc.nextLine());
		StringBuffer s2=new StringBuffer(sc.nextLine());
		StringBuffer s3=new StringBuffer();
		int i=0,j=0;
		for(i=0;i<s1.length();i++)
		{
			for(j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					s3=s1.deleteCharAt(i);
				}
			}
		}
		System.out.println(s3);
     
	}

}
