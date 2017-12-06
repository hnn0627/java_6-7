package java_7;

public class airplane_ex {
	public static void main(String[] args) {
		
		superairplane sa =  new superairplane();
		sa.takeoff();
		sa.fly();
		sa.flymode = superairplane.supersonic;
		sa.fly();
		sa.flymode = superairplane.nomal;
		sa.fly();
		sa.land();
		
	}

}
