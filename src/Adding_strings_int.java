import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Adding_strings_int
{
public static void main(String[] args) throws Exception
{ 
int x,y; 

BufferedReader z = new BufferedReader(new InputStreamReader(System.in)); 

System.out.println("enter 2 values:");

x = Integer.parseInt(z.readLine()); 
y = Integer.parseInt(z.readLine()); 

System.out.println(x+y);

}
}