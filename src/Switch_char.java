import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Switch_char
{
public static void main(String[] args) throws Exception
{ 
String x; 

BufferedReader z = new BufferedReader(new InputStreamReader(System.in)); 

System.out.println("enter your choice:");

x = z.readLine(); 

switch (x)
{ 
case "A": System.out.println("Telugu"); 
break;

case "B": System.out.println("Hindi"); 
break; 

case "C": System.out.println("English"); 
break; 

default: System.out.println("Invalid Entry!"); 
} 

}
}