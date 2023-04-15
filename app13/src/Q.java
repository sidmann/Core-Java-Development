class Q
{
	static int i = 10;
	public static void main(String[] args) 
	{
		System.out.println("m1:" + i);
		int i = 20;
		System.out.println("m2:" + i);
		System.out.println("m3:" + Q.i);
	}
}
