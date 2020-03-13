import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Adding_strings
{
public static void main(String[] args) throws Exception
{ 
String x,y; 

BufferedReader z = new BufferedReader(new InputStreamReader(System.in)); 

System.out.println("enter 2 values:");

x = z.readLine(); 
y = z.readLine(); 

System.out.println(x+y);

}
}