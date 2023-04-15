class K
{
	int i;

	public static void main(String[] args)
	{
		K k1 = new K();
		K k2 = k1;
		K k3 = k1;
		K k4 = k1;

		k3.i = 200;
		System.out.println(k1.i);
		System.out.println(k2.i);
		System.out.println(k3.i);
		System.out.println(k4.i);
	}
}
