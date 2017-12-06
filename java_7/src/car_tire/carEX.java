package car_tire;

public class carEX {
 public static void main(String[] args) {
	  
	 car c1 = new car();
	  for(int i =1; i <=5; i++) {
		  int problemlocation = c1.run();
	
	  switch(problemlocation) {
	 case 1:
		 System.out.println("앞왼쪽 한국타이어로 교체");
		 c1.frontlefttire = new hankooktire("앞왼쪽",15);
		 break;
	 case 2:
		 System.out.println("앞 오른쪽 금호타이어로 교체");
		 c1.frontrightttire = new hankooktire("앞오른쪽",13);
		 break;
	 case 3:
		 System.out.println("뒤왼쪽 한국타이어로 교체");
		 c1.backleftttire = new hankooktire("뒤왼쪽",14);
		 break;
	 case 4:
		 System.out.println("뒤오른쪽 한국타이어로 교체");
		 c1.backrightttire = new hankooktire("뒤오른쪽",17);
		 break;
	 }
	  System.out.println("-----------------------------------------------");
 }  
 }
}
