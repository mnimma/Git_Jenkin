
public class Person 
{
//variable - data 
String name = "Ramesh"; 
int age = 32;
//method 
public void m1() 
{ 
System.out.println("Hello ,Iam "+name);
System.out.println("My age is "+age); 
} 

public static void main(String args[])
{ 
Person p = new Person(); 
p.m1(); 
}
}
