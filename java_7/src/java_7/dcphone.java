
package java_7;

public class dcphone extends cphone {
	int channel;
	
dcphone(String model, String color, int channel){	
this.model = model;	
this.color = color;
this.channel = channel;
	}
void turnon() {
	System.out.println("dmb����� �����մϴ�.");
}
void changchanneldmb(int channel) {
		System.out.println("ä���� �ٲߴϴ�..");
}
void turnoff() {
	System.out.println("dmb����� �ߴ��մϴ�..");
}
}

