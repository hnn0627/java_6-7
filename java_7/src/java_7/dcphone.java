
package java_7;

public class dcphone extends cphone {
	int channel;
	
dcphone(String model, String color, int channel){	
this.model = model;	
this.color = color;
this.channel = channel;
	}
void turnon() {
	System.out.println("dmb방송을 수신합니다.");
}
void changchanneldmb(int channel) {
		System.out.println("채널을 바꿉니다..");
}
void turnoff() {
	System.out.println("dmb방송을 중단합니다..");
}
}

