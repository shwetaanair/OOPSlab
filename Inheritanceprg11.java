import java.util.*;
class Employee
{
int emp_id;
String emp_name;
int emp_salary;
String address;
Employee(int emp_id,String emp_name,int emp_salary,String address)
{
this.emp_id=emp_id;
this.emp_name=emp_name;
this.emp_salary=emp_salary;
this.address=address;
}
}    
class Teacher extends Employee
{
String department;
String subject;
Teacher(int emp_id,String emp_name,int emp_salary,String address,String department,String subject)
{
super(emp_id,emp_name,emp_salary,address);
this.department=department;
this.subject=subject;
}
}
class Inheritance
{
public static void main(String args[])
{
int i,flag=0;
Scanner sc=new Scanner(System.in);  
Scanner s=new Scanner(System.in);
System.out.println("enter the size:");
int n=sc.nextInt();
Teacher[] obj=new Teacher[n];
for(i=0;i<n;i++)
{
System.out.println("enter the details of teacher: "+(i+1));
System.out.println("Subject:");
String subject=s.nextLine();
System.out.println("department:");
String department=s.nextLine();
System.out.println("employee id:");
int emp_id=sc.nextInt();
System.out.println("employee name:");
String emp_name=s.nextLine();
System.out.println("salary:");
int emp_salary=sc.nextInt();
System.out.println("address:");
String address=s.nextLine();
obj[i]=new Teacher(emp_id,emp_name,emp_salary,address,subject,department);
}
System.out.println("enter the employee number to be searched:");
int no=s.nextInt();
boolean found=false;
for(i=0;i<n;i++)
{
      if(obj[i].emp_id==no)
      {
        found=true;
        System.out.println("Employee id:"+obj[i].emp_id);
        System.out.println("Employee name:"+obj[i].emp_name);
        System.out.println("Employee salary:"+obj[i].emp_salary);
        System.out.println("Employee address:"+obj[i].address);
        System.out.println("Subject:"+obj[i].subject);
        System.out.println("Department:"+obj[i].department);
        break;
      }
    }
      if(!found) {
        System.out.println("not found");
      }
      sc.close();
  }
}        

         
