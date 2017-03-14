interface D1
{
	default public void meth1()
	{
		System.out.println("method in D1");
	};
}

interface D2
{
	default public void meth1()
	{
		System.out.println("method in D2");
	};
}



public class Duplicate implements D1, D2
{
	public void meth1()
	{
		D2.super.meth1();
	}
	
	public static void main(String[] args)
	{
		Duplicate c = new Duplicate();
		c.meth1();
	}

}