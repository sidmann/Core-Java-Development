class Z23
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 300, 4, 4005, 20};
		for(int i = 0; i < elements.length; i++)
		{
			System.out.println(elements[i]);
		}
		System.out.println("------------");
		for(int i : elements)
		{
			System.out.println(i);
		}
	}
}
