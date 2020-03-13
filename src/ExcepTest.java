
public class ExcepTest 
{
public static void main(String args[])
{ 
try
{ 
int a[] = {10,20,30,40,50};
System.out.println("Access element :" + a[0]);
}

catch(Exception x)
{ 
System.out.println("Exception thrown :" + x); 
System.out.println("Out of the block");
} 

}
}