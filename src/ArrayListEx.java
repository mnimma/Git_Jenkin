

// Collections Ex1

import java.util.ArrayList;

public class ArrayListEx
{
public static void main(String[] args) 
{ 
ArrayList<String> x = new ArrayList<String>(1);

x.add("Shirt"); //index 0
x.add("Fant"); //index 1
x.add("Shoes"); //index 2

System.out.println(x); 

System.out.println(x.get(1)); 

x.set(2,"Cell");
System.out.println(x); 

}
}