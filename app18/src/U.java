class A 
{
	int i;
}
class U
{
	int j;
	A a1;  //   has-a relation
	void test()
	{
		j = 90;
		i = 200;
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
}
