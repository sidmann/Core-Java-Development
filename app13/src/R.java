class R
{
	static int i = 10;
	public static void main(String[] args) 
	{
		System.out.println("m1:" + i);
		int i = 20;
		System.out.println("m2:" + i);
		System.out.println("m3:" + R.i);
		i = 40;
		System.out.println("m4:" + i);
		System.out.println("m5:" + R.i);
		R.i = 60;
		System.out.println("m6:" + i);
		System.out.println("m7:" + R.i);
	}
}
