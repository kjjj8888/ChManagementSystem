
import java.util.Scanner;
import java.util.Properties;
public class Character 
{
		static String name;
		private static int _wallet = 100;
		static String job;
		static String sexuality;		
		int getwallet()
		{
			return _wallet;
		}
		static void setwallet(int wallet)
		{
			_wallet = wallet;
		}
		
		
		static void View_Character()
		{
			System.out.println("Character Name:" + name);
			System.out.println("Money:" + _wallet);
			System.out.println("Job:" + job);
			System.out.println("Sexuality:" + sexuality);
		}
		
		public static void Create_Ch()
		{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("�̸��� �Է����ּ���");
			name = sc.nextLine();
			System.out.println("������ �������ּ��� 0:Male 1:Female");
			int a = sc.nextInt();
			sexuality = a==0 ? "��" : "��";
			System.out.println("������ �������ּ��� 1:�л� 2:��� 3:������");
			int b = sc.nextInt();
			if (b==1)
				job = "�л�";
			else if (b==2)
				job = "���";
			else if (b==3)
				job = "������";
			else 
			{
				job = null; 
				System.out.println("������ ���������� ���õ��� �ʾҽ��ϴ�");
			}
			
			
				
		}
		public static void Edit_Ch()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("������ �κ��� �������ּ���\n 1: �̸� \n 2: �� \n 3: ���� \n 4: ���ư���");
			int a = sc.nextInt();
			switch(a)
			{
				case(1): {
					     System.out.println("�̸��� �Է����ּ���"); 
					     String _name = sc.next();
					     System.out.println(_name + "�� ����Ǿ����ϴ�"); 
					     name = _name;
					     Edit_Ch();
						 break;
						 }
				case(2): {
						 System.out.println("������ �������ּ��� 0:Male 1:Female");
						 int _a = sc.nextInt();
						 String _sexuality = _a==0 ? "��" : "��";
						 System.out.println(_sexuality + "�� ����Ǿ����ϴ�");
						 sexuality = _sexuality;
						 Edit_Ch();
						 break;
						 }
				case(3): {
						 System.out.println("������ �������ּ��� 1:�л� 2:��� 3:������");
						 int b = sc.nextInt();
						 String _job;
						 if (b==1)
							 _job = "�л�";
						 else if (b==2)
							 _job = "���";
						 else if (b==3)
							 _job = "������";
						 else 
						 {
							 _job = null; 
							 System.out.println("������ ���������� ���õ��� �ʾҽ��ϴ�");
						 }
						 System.out.println(_job + "�� ����Ǿ����ϴ�");
						 job = _job;
						 Edit_Ch();
						 break;
						 }	
				case(4): break;
				default: Edit_Ch();
			}
			
		}
}