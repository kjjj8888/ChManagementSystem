
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
			System.out.println("이름을 입력해주세요");
			name = sc.nextLine();
			System.out.println("성별을 선택해주세요 0:Male 1:Female");
			int a = sc.nextInt();
			sexuality = a==0 ? "남" : "여";
			System.out.println("직업을 선택해주세요 1:학생 2:백수 3:직장인");
			int b = sc.nextInt();
			if (b==1)
				job = "학생";
			else if (b==2)
				job = "백수";
			else if (b==3)
				job = "직장인";
			else 
			{
				job = null; 
				System.out.println("직업이 정상적으로 선택되지 않았습니다");
			}
			
			
				
		}
		public static void Edit_Ch()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("수정할 부분을 선택해주세요\n 1: 이름 \n 2: 성 \n 3: 직업 \n 4: 돌아가기");
			int a = sc.nextInt();
			switch(a)
			{
				case(1): {
					     System.out.println("이름을 입력해주세요"); 
					     String _name = sc.next();
					     System.out.println(_name + "로 변경되었습니다"); 
					     name = _name;
					     Edit_Ch();
						 break;
						 }
				case(2): {
						 System.out.println("성별을 선택해주세요 0:Male 1:Female");
						 int _a = sc.nextInt();
						 String _sexuality = _a==0 ? "남" : "여";
						 System.out.println(_sexuality + "로 변경되었습니다");
						 sexuality = _sexuality;
						 Edit_Ch();
						 break;
						 }
				case(3): {
						 System.out.println("직업을 선택해주세요 1:학생 2:백수 3:직장인");
						 int b = sc.nextInt();
						 String _job;
						 if (b==1)
							 _job = "학생";
						 else if (b==2)
							 _job = "백수";
						 else if (b==3)
							 _job = "직장인";
						 else 
						 {
							 _job = null; 
							 System.out.println("직업이 정상적으로 선택되지 않았습니다");
						 }
						 System.out.println(_job + "로 변경되었습니다");
						 job = _job;
						 Edit_Ch();
						 break;
						 }	
				case(4): break;
				default: Edit_Ch();
			}
			
		}
}