package java_6;

public class carthis {
	
	String company = "현대차";
	String model;
	String color;
	int maxspeed;

	carthis(){
	}
	carthis(String model){
		this(model,"은색",330);
	}
	carthis(String model, String color){
		this(model,color,330);
		
	}
	carthis(String model, String color, int maxspeed){ //매개 변수 순서로 저장
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}

	}



