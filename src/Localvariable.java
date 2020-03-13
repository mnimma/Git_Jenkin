
public class Localvariable {

	public void m1()
	{
		int a=10;
		System.out.println("It is 1st method");
		System.out.println(a);
	}
	
	public void m2()
	{
		System.out.println("It is 2nd Method");
	}
	
	public void m3()
	{
		System.out.println("It is 3rd Method");
		//System.out.println(a);
	}
	public static void main (String args[])
	{
		System.out.println("Hai");
		
		Localvariable z = new Localvariable ();
		
		z.m1();
		z.m2();
		z.m3();
	}
}
