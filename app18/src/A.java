class A 
{
	int i;
}
class B extends A // A is a super-class & B is a sub-class to A.
{
	int j;
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.i); // i got inherited from A to B.
		System.out.println(a1.j);
	}
}
