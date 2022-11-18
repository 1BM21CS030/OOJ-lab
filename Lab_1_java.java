import java.util.Scanner;
import java.lang.Math;

class solution
   {
       public static void main(String args[])
       {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter coefficients");
        
        float a=s.nextFloat();
        float b=s.nextFloat(); 
        float c=s.nextFloat();

      


if(a!=0){
double d=b*b-4*a*c;
if(d==0){
double r1=(-b)/(2*a);
System.out.println("Roots are equal and is equal to "+r1);
}else if(d<0){
double r1=(Math.sqrt(Math.abs(d)))/(2*a);
double r2=(-b)/(2*a);
System.out.println("Imaginary roots.Roots are "+r2+"+i"+r1+"and "+r2+"-i"+r1);
}else{
double r1=(-b+Math.sqrt(d))/(2*a);
double r2=(-b-Math.sqrt(d))/(2*a);
System.out.println("Roots are real and distinct. Roots are "+r1+" and "+r2);
}
}
else
{
System.out.println("Not a quadratic equation");
}
}}