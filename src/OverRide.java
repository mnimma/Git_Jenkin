class Over 
{
	void m1(int x)
	{
		System.out.println(x*x);
	}

}

public class OverRide extends Over
{
	void m1(int x)
	{
		System.out.println(x+x);
	}
	
public static void main(String args[])
{
	Over t1 = new Over();
	t1.m1(6);
	
OverRide t2 = new OverRide();
t2.m1(6);
}
}
