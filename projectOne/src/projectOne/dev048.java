package projectOne;

public class dev048 
{

	public static void main(String[] args) 
	{
		int x = 30;

		do
		{
			x = x - 1;
						
			if(x%4 == 0)
			{
				System.out.print("["+x+"] \n");
			}
			if(x%4 != 0)
			{
				System.out.print(""+x+" \n");
			}
		}
		while(x > 1);

	}

}
