class Z35
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		int i = 1;
		int j = test1(i++) + i + test1(++i) + i + test1(i--) + i + test1(--i) + i + test2(i++) + i + test2(++i) + i + test2(i--) + i + test2(--i) + i + test3(i++) + i + test3(++i) + i + test3(i--) + i + test3(--i) + i + test4(i++) + i + test4(++i) + i + test4(i--) + i + test4(--i) + i;
		System.out.println(i + ", " + j);
	}
	public static int test1(int i)
	{
		return i++;
	}
	public static int test2(int i)
	{
		return ++i;
	}
	public static int test3(int i)
	{
		return i--;
	}
	public static int test4(int i)
	{
		return --i;
	}
}
