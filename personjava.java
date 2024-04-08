import java.util.*;
class person
{
String p_name;
String gender;
String address;
int age;
person(String p_name,String gender,String address,int age)
{
this.p_name=p_name;
this.gender=gender;
this.address=address;
this.age=age;
}
}
class employee extends person{
int empid;
String company_name;
String qualification;
int salary;
employee(String p_name,String gender,String address,int age,int empid,String company_name,String qualification,int salary)
{
super(p_name,gender,address,age);
this.empid=empid;
this.company_name=company_name;
this.qualification=qualification;
this.salary=salary;
}
}
class teacher extends employee{
String subject;
String department;
int teacher_id;
teacher(String p_name,String gender,String address,int age,int empid,String company_name,String qualification,int salary,int teacher_id,String subject,String department)
{
super(p_name,gender,address,age,empid,company_name,qualification,salary);
this.subject=subject;
this.department=department;
this.teacher_id=teacher_id;
}    
}
class personjava
{
public static void main(String args[])
{
int i;
Scanner sc=new Scanner(System.in);
Scanner s=new Scanner(System.in);
System.out.println("enter the size:");
int n=sc.nextInt();
teacher[] obj=new teacher[n];
for(i=0;i<n;i++)
{
System.out.println("||||||||||||||||||||||||||||||||||||||||||||||");
System.out.println("enter thge details of teacher:"+(i+1));
System.out.println("Person name:");
String p_name=s.nextLine();
System.out.println("Gender:");
String gender=s.nextLine();
System.out.println("Address:");
String address=s.nextLine();
System.out.println("Age:");
int age=sc.nextInt();
System.out.println("Employee id:");
int empid=sc.nextInt();
System.out.println("Company name:");
String company_name=s.nextLine();
System.out.println("Qualification:");
String qualification=s.nextLine();
System.out.println("Salary:");
int salary=sc.nextInt();
System.out.println("Teacher id:");
int teacher_id=sc.nextInt();
System.out.println("Subject:");
String subject=s.nextLine();
System.out.println("Department:");
String department=s.nextLine();
obj[i]=new teacher(p_name,gender,address,age,empid,company_name,qualification,salary,teacher_id,subject,department);
           
}
System.out.println("enter the teacher id to be searched:");
int no=sc.nextInt();
boolean found=false;
for(i=0;i<n;i++)
{
if(obj[i].teacher_id==no)
{
found=true;
System.out.println("Person name:"+obj[i].p_name);
System.out.println("Gender:"+obj[i].gender);
System.out.println("Address:"+obj[i].address);
System.out.println("Age:"+obj[i].age);
System.out.println("Employee id:"+obj[i].empid);
System.out.println("Company name:"+obj[i].company_name);
System.out.println("Qualification:"+obj[i].qualification);
System.out.println("Salary:"+obj[i].salary);
System.out.println("Teacher id:"+obj[i].teacher_id);
System.out.println("Subject:"+obj[i].subject);
System.out.println("Department:"+obj[i].department);
break;
}
if(!found)
{
System.out.println("Not found");
}
sc.close();
}
}
}
