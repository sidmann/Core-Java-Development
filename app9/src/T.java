class T
{
	enum Gender {MALE, FEMALE}
	enum Education {TENTH, TWELFTH, GRADUATION, POST_GRADUATION};

	public static void main(String[] args) 
	{
		System.out.println(Gender.MALE.ordinal());
		System.out.println(Gender.FEMALE.ordinal());
		System.out.println(Education.TENTH.ordinal());
		System.out.println(Education.TWELFTH.ordinal());
		System.out.println(Education.GRADUATION.ordinal());
		System.out.println(Education.POST_GRADUATION.ordinal());
	}
}
