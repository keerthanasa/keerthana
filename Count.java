import java.util.Scanner;


public class Count {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=0,count=0;
	while(n>0)
	{
		m=n%10;
		count++;
		n=n/10;
	}System.out.println(count);
	}

}
