import java.util.Scanner;

abstract class Shape{
    int b,h;
    void printArea(){}
}

class Rectangle extends Shape{
    Rectangle(int a,int c){
        b=a;
        h=c;
    }
    void printArea(){
        System.out.println("Area of the rectangle is "+(b*h));
    }
}

class Triangle extends Shape{
    Triangle(int a,int c){
        b=a;
        h=c;
    }
    void printArea(){
        System.out.println("Area of the triangle is "+(b*h/2));
    }
}

class Circle extends Shape{
   Circle(int a){
       b=h=a;
    }
    void printArea(){
        System.out.println("Area of the circle is "+(Math.PI*b*h));
    }
}

class Lab_4{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int shape;
         System.out.println("Enter the shape\n1.Rectangle\n2.Triangle\n3.Circle\n4.Exit");
      do {
         shape=s.nextInt();
        if(shape==1){
            System.out.println("Enter breadth and height");
            int a=s.nextInt();
            int c=s.nextInt();
            Rectangle r=new Rectangle(a, c);
            r.printArea();
        }else if(shape==2){
            System.out.println("Enter side length and height");
            int a=s.nextInt();
            int c=s.nextInt();
            Triangle r=new Triangle(a, c);
            r.printArea();
        }else if(shape==3){
            System.out.println("Enter radius");
            int a=s.nextInt();
           Circle r=new Circle(a);
            r.printArea();
        }
      }while (shape!=4); 
        s.close();
    }
}