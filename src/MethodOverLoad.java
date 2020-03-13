
public class MethodOverLoad 
{


public void add(int a,int b)
{
System.out.println("Sum of two="+(a+b));
}


public void add(int a,int b,int c)
{
System.out.println("Sum of three="+(a+b-c));
}

public static void main(String args[])
{
MethodOverLoad s = new MethodOverLoad();
s.add(10,15); //This call is bound with first method
s.add(10,15,20); //this is bound with second method
}

}