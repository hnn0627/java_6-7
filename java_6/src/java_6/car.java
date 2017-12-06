package java_6;

public class car {
	
String company = "현대차";
String model;
String color;
int maxspeed;

car(){
}
car(String m){
	model = m;
}
car(String m, String c){
	model = m;
	color = c;
}
car(String m, String c, int ms){ //매개 변수 순서로 저장
	model = m;
	color = c;
	maxspeed = ms;
}

}


