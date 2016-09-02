class Duplicate
{
public static void main(String args[])
{
LinkedHashSet s=new LinkedHashSet();
Scanner sc=new Scanner(System.in);
String s=sc.next();
char []a=s.toCharArray();
int n=a.length;
int i=0;
for(i=0;i<n;i++)
{
s.add(a[i]);
}
System.out.println(s);
}
}
