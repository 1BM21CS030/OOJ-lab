import java.util.Scanner;

class Book{
String name,author;
int num_pages;
float price;

Book(String n,String a,int num,float p){
n=name;
a=author;
num=num_pages;
p=price;
}
Book(){}

void accept(){
Scanner  s=new Scanner(System.in);
System.out.println("Enter book name");
name=s.nextLine();
System.out.println("Enter book author");
author=s.nextLine();
System.out.println("Enter number of pages and price of book");
num_pages=s.nextInt();
price=s.nextFloat();
}

void get(){
System.out.println("Title: "+name);
System.out.println("Author: "+author);
System.out.println("Number of pages: "+num_pages);
System.out.println("Price: "+price);
}

public String toString(){
return ("Title: "+name+"\nAuthor: "+author+"\nNumber of pages: "+num_pages+"\nPrice: "+price);
}
}

class Lab_3{
public static void main(String x[]){
int n;
Scanner  s=new Scanner(System.in);
System.out.println("Enter number of books to be created");
n=s.nextInt();
Book[] b=new Book[n];
for(int i=0;i<n;i++){
b[i]=new Book();
b[i].accept();
}
for(int i=0;i<n;i++){
System.out.print("\nBook entry number "+(i+1)+"\n\n");
b[i].get();
}
}
}