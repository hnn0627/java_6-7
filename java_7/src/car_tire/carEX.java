package car_tire;

public class carEX {
 public static void main(String[] args) {
	  
	 car c1 = new car();
	  for(int i =1; i <=5; i++) {
		  int problemlocation = c1.run();
	
	  switch(problemlocation) {
	 case 1:
		 System.out.println("�տ��� �ѱ�Ÿ�̾�� ��ü");
		 c1.frontlefttire = new hankooktire("�տ���",15);
		 break;
	 case 2:
		 System.out.println("�� ������ ��ȣŸ�̾�� ��ü");
		 c1.frontrightttire = new hankooktire("�տ�����",13);
		 break;
	 case 3:
		 System.out.println("�ڿ��� �ѱ�Ÿ�̾�� ��ü");
		 c1.backleftttire = new hankooktire("�ڿ���",14);
		 break;
	 case 4:
		 System.out.println("�ڿ����� �ѱ�Ÿ�̾�� ��ü");
		 c1.backrightttire = new hankooktire("�ڿ�����",17);
		 break;
	 }
	  System.out.println("-----------------------------------------------");
 }  
 }
}
