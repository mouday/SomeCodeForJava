
public class Display {
	private int value=0;
	private int limit=0;
	
	public Display(int limit)
	{
		this.limit=limit;
	}
	
	public void increace()
	{
		value++;
		if (value==limit)
		{
			value=0;
		}
	}
	
	public int getvalue()
	{
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d=new Display(24);
		for(;;)
		{
			d.increace();
			System.out.println(d.getvalue());
		}
	}

}
