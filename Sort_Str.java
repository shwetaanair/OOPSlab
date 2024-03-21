import java.util.*;
import java.util.Arrays;
class Sort_Str
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of strings:");
int n=sc.nextInt();
String s= sc.nextLine();
String[] str = new String[n];
System.out.println("Enter the strings:");
for(int i=0;i<n;i++)
{
str[i]=sc.nextLine();
}

Arrays.sort(str);
System.out.println("sorted elements are:");
for(int i=0;i<n;i++)
{
System.out.println(str[i]);
}
}
}
