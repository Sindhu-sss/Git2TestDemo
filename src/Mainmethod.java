class Mother
{
	public void cooking()
	{
		System.out.println("Prepares round Chapathis");
	}
}

class Daughter extends Mother
{
	public void cooking()
	{
		System.out.println("Prepares triangle Chapathis");
	}
}
public class Mainmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daughter d1=new Daughter();
		d1.cooking();
	}
	
	

}
