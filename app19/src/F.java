class F
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		//int[] elements = new int[999999999];
		StringBuffer[] elements = new StringBuffer[999999999];
		for (int i = 0; i < elements.length; i++)
		{
			elements[i] = new StringBuffer("hello");
		}
		System.out.println(2);
	}
}
