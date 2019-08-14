class AgeException extends Exception
{
	AgeException(String str)
	{
		super(str);
	}
}



public class AgeExceptnHndlr {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		int age=6;
		if(age<15) 
		{
			throw new AgeException("Invalid Age");
		}

	}

}
