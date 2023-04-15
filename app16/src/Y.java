class Y
{
	int i;
	Y()
	{
		System.out.println("from constructor: " + this.i);
		this.i = 90;
	}
	void test()
	{
		System.out.println("from test: " + this.i);
		this.i = 120;
	}
	public static void main(String[] args) 
	{
		Y obj1 = new Y();
		System.out.println("from main1: " + obj1.i);
		obj1.test();
		System.out.println("from main2: " + obj1.i);
	}
}
