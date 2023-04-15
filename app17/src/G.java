class G
{
	static int count;
	G()
	{
		count++;
	}
	G(int i)
	{
		count++;
	}
	public static void main(String[] args) 
	{
		G g1 = new G();
		G g2 = new G();
		G g3 = new G(20);
		G g4 = new G(50);		
		System.out.println(count);
	}
}
