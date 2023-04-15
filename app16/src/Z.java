class Z
{
	int i;
	Z()
	{
		System.out.println("from constructor: " + i);
		i = 90; // this.i = 90;
	}
	void test()
	{
		System.out.println("from test: " + i);
		i = 120;  // this.i = 120;
	}
	public static void main(String[] args) 
	{
		Z obj1 = new Z();
		System.out.println("from main1: " + obj1.i);
		obj1.test();
		System.out.println("from main2: " + obj1.i);
	}
}
