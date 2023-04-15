class P
{
	int i;
	static void test1(P p1)
	{
		System.out.println("test1:" + p1.i);
		p1.i += 5; //15
	}
	static void test2(P p1)
	{
		System.out.println("test2:" + p1.i);
		p1.i += 15; //40
	}
	static void test3(P arg)
	{
		System.out.println("test3:" + arg.i);
		arg.i += 25; //75
	}

	public static void main(String[] args)
	{
		System.out.println("main begin");
		P ref = new P();
		ref.i = 10;
		System.out.println("main1:" + ref.i); //10
		test1(ref); //10
		System.out.println("main2:" + ref.i); //15
		ref.i += 10; //25
		System.out.println("main3:" + ref.i); //25
		test2(ref); //25
		System.out.println("main4:" + ref.i); //40
		ref.i += 10; //50
		System.out.println("main5:" + ref.i); //50
		test3(ref); //50
		System.out.println("main6:" + ref.i); //75

	}
}
