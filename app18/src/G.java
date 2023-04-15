class B 
{
	static int i;
}
class G extends B
{
	int j;
	static int k;
	public static void main(String[] args) 
	{
		G g1 = new G();
		System.out.println(g1.j);
		System.out.println(G.i);
		System.out.println(G.k);
	}
}
