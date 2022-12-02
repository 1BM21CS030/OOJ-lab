import java.util.Scanner;

class student{  
    student(){}
String name;
String usn;
float res=0;
int n;
int credits[]=new int[3];
int marks[]=new int[3];
int t=0;


void accept()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter your Name ");
name=s.nextLine();
System.out.println("Enter USN ");
usn=s.nextLine();
System.out.println("Enter credits and marks");
for(int i=0;i<3;i++)
{
this.credits[i]=s.nextInt();
this.marks[i]=s.nextInt();
}
}
void calculate()
{
int grade=0;
for(int i=0;i<3;i++)
 {
if(marks[i]>=90)
grade=10;
else if(marks[i]>=80)
grade=9;
else if(marks[i]>=70)
grade=8;
else if(marks[i]>=60)
grade=7;
else if(marks[i]>=50)
grade=6;
else if(marks[i]>=40)
grade=5;
else grade=0;
res=res+grade*credits[i];
 }
for(int i=0;i<3;i++)
t+=credits[i];
res=res/t;
}
void display()
{
System.out.println("Name:"+name+"\nUSN:"+usn);
System.out.println("Marks");
for(int i=0;i<3;i++)
System.out.println(marks[i]);
System.out.println("SGPA="+res);
}
}


class Lab_2
{
public static void main(String args[])
{
student s1=new student();
s1.accept();
s1.calculate();
s1.display();
}
}
