
public class StaticVariable {
	 static int x=10;
	 //int y=10;
	
	public StaticVariable()
	{
		x++;
		//y++;
		System.out.println(x);
		//System.out.println(y);
	}

	public static void main(String args[])
	
	{
		StaticVariable c1= new StaticVariable();
		StaticVariable c2= new StaticVariable();
		StaticVariable c3= new StaticVariable();
	}
}
