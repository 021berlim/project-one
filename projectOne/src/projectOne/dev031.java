package projectOne;
import javax.swing.JOptionPane;
public class dev031 
{
	public static void main(String[] args) 
	{
	int contador = 1;
	String Nome;
		do 
		{
			Nome=JOptionPane.showInputDialog(null,"Nome: ");
			contador++;
		} 
		while (contador<=5);

	}

}
