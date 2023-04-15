class Z7
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		int i = test() + 500 + test();
		System.out.println("-------------11");
		int j = i + test() + 600 + test();
		System.out.println("-------------22");
		System.out.println(i + j + test() + test());
		System.out.println("-------------33");
		int k = i + j + test() + 4 * test();
		System.out.println("-------------44");
		System.out.println(i + ", " + j + ", " + k);
	}
	public static int test()
	{
		System.out.println("test");
		return 100;
	}
}
