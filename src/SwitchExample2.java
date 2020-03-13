import java.util.Scanner;

public class SwitchExample2 
{
public static void main(String[] args) 
{ 
int x; 

Scanner z = new Scanner(System.in); 

System.out.println("enter your choice:");

x = z.nextInt();

switch (x)
{ 
case 10: System.out.println("Telugu"); 
break; 

case 20: System.out.println("Hindi"); 
break; 

case 30: System.out.println("English"); 
break; 

default: System.out.println("Invalid Entry!"); 
} 

}
}