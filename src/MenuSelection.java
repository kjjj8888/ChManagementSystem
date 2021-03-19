
import java.util.Scanner;
public class MenuSelection {
	public static void main(String args[])
	{
		int num = 0;
		Scanner sc = new Scanner(System.in);
		Character ch = new Character();
		while (num != 6)
		{
			System.out.println("1. create charater");
			System.out.println("2. delete charater");
			System.out.println("3. edit charater");
			System.out.println("4. view charater");
			System.out.println("5. show Menu");
			System.out.println("6. exit");
			num = sc.nextInt();
			switch(num) 
			{
				case(1): Character.Create_Ch();
						 break;
				case(2): Character.name = null; 
					     Character.job = null;
					     Character.sexuality = null;
					     Character.setwallet(100);
					     break;
				case(3): Character.Edit_Ch();
						 break;
				case(4): Character.View_Character();
						 break;
				case(5): continue;
				default: continue;
				
			}
		}
	}
}

