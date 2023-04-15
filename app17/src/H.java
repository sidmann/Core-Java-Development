class H 
{
	static int count;
	
	H()
	{
		//some specific execution
	}

	H(int i)
	{
		//some specific execution
	}

	H(double d1)
	{
		//some specific execution
	}

	{
		count++;
	}

	public static void main(String[] args) 
	{
		H h1 = new H();
		H h2 = new H(10);
		H h3 = new H(1.4);
		H h4 = new H();
		System.out.println(count);
	}
}
