import java.util.*;

class Area1
{
void area(int x)
{
System.out.println("The area of the square is: "+x*x+"sq units");
}
void area(int x,int y)
{
System.out.println("The area of the rectangle is: "+x*y+"sq units");
}
void area(double x)
{
double z=3.14*x*x;
System.out.println("The area of the circle is: "+z+"sq units");
}
}

class Shapes
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Area1 obj=new Area1();
System.out.println("Enter the side of the square:");
int side=sc.nextInt();
obj.area(side);

System.out.println("Enter the radius of the circle:");
double r=sc.nextDouble();
obj.area(r);

System.out.println("Enter the length and breadth of the rectangle:");
int l=sc.nextInt();
int b=sc.nextInt();
obj.area(l,b);

}
}
