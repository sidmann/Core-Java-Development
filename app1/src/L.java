class L
{
	public static void main(String[] args) 
	{
		int i = 5;
		int j =i++ + i;
		//     5     6 
		System.out.println(i);  //  6
		System.out.println(j);  //  11
	}
}
