
class X
{
	protected void m1()
	{ System.out.println("It is class X");
	}
}
class Y extends X
{
	protected void m2()
	{ System.out.println(" It is Class Y");
	
	}
}

public class Z extends Y

{
	protected void m3()
	{
		System.out.println("It is Class Z");
	}
		
public static void main (String [] args)
{
	Z a = new Z();
	a.m1();
	a.m2();
	a.m3();
	
			
		
	}
}
	
