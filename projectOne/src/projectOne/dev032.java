package projectOne;
import javax.swing.JOptionPane;
public class dev032 
{

	public static void main(String[] args) 
	{
		String Nome;
		do
		{
			Nome=JOptionPane.showInputDialog(null,"Nome: ");
		}
		while (!Nome.equals(""));
	}

}

