package java_6;

public class carthis {
	
	String company = "������";
	String model;
	String color;
	int maxspeed;

	carthis(){
	}
	carthis(String model){
		this(model,"����",330);
	}
	carthis(String model, String color){
		this(model,color,330);
		
	}
	carthis(String model, String color, int maxspeed){ //�Ű� ���� ������ ����
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}

	}



