class S
{
	public static void main(String[] args) 
	{
		int i = 5;
		int j = i--;
		System.out.println(i); 
		System.out.println(j);
		
		i = 5;
		i = i++;
		System.out.println(i);
	}
}
