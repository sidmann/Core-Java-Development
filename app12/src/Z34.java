class Z34
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		int i = 1;
		int j = test1(i++);
		int k = test1(++i);
		int l = test1(j--);
		int m = test1(--j);
		System.out.println(i + ", " + j + ", " + k + ", " + l + ", " + m);
	}
	public static int test1(int i)
	{
		System.out.println("test1:" + i);
		return i++ + i;
	}
}
