class parentclass
{
	final int x = 10;
	public void show()
	{
		System.out.println("value = "+ x);
		System.out.println("changing the value of 'x' is not possible");
	}
}
public class Final_variable {

	public static void main(String[] args) {
		
		parentclass obj1 = new parentclass();
		obj1.show();

	}

}