package java_6;

public class area_ex {
public static void main(String[]args) {
	
	arrea myCalcu = new arrea();
	  
	  //정사각형의 넓이 구하기
	  double result1 = myCalcu.rectanglearea(5);
	  //직사각형의 넓이 구하기
	  double result2 = myCalcu.rectanglearea(5, 6);
	  
	  //결과 출력
	  System.out.println("정사각형 넓이=" + result1);
	  System.out.println("직사각형 넓이=" + result2);
	 
	
}
}
