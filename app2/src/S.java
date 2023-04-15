class S
{
	public static void main(String[] args) 
	{
		int i = 0;
		System.out.println((++i == i++) && (i++ == ++i));
		System.out.println(i);
	}
}
