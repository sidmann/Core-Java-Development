class Z1
{
	enum Gender {MALE, FEMALE}
	public static void main(String[] args) 
	{
		Gender var = Gender.MALE;
		switch(var)
		{
			case MALE:
				System.out.println("case MALE");
				break;
			case FEMALE:
				System.out.println("case FEMALE");
				break;
		}
	}
}
