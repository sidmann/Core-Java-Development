class Q 
{
	public static void main(String[] args) 
	{
		int i = 5;
		int j = i++ + i + i++ + i + i++ + i++ + i++ + i++ + i++ +
			//   5    6    6    7    7     8     9      10   11 
			    i-- + i + i++ + i + i-- + i++ + i-- + i++ + i-- + i;
            //   12   11   11   12   12    11    12    11    12   11
		System.out.println(i); // 11
		System.out.println(j); // 184 
	}
}
