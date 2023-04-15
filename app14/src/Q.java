class Q
{
	static int i = j;
	static int j;
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}


/*
  error: illegal forward reference
        static int i = j;
                       ^
1 error
*/
