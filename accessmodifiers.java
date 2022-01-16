class A
{  
private int a=60;  
public int b=40; 
int c=80;
protected int d=55;
}  
  
class Main extends A
{  
 public static void main(String args[]){  
   A obj=new A();  
   System.out.println(obj.b);//it prints 40  
   //System.out.println(obj.a);//it gives compile time errror since a is private variable
   System.out.println(obj.c);//it prints 80 as it belongs to same package
   System.out.println(obj.d);//it prints  55 as class B is extending class A 
   
   }  
}  }