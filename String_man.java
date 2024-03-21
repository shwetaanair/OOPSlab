import java.util.Scanner;
public class String_man
{
    public static void main(String[] args)
    {
        System.out.println("Enter The String");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("LOWERCASE : "+str1.toLowerCase());
        System.out.println("UPPERCASE : "+str1.toUpperCase());
        //System.out.println("Substring"+str1.SubString(1,5));
        System.out.println("Length of String = "+str1.length());
    }
}

