package java_7;

public class dcphone_ex {
	public static void main(String[]args) {
		
dcphone dmbphone = new dcphone("자바폰","실버",10);
		
	System.out.println("model =" +dmbphone.model);
	System.out.println("model =" +dmbphone.color);

	dmbphone.poweron();
	dmbphone.poweroff();
	dmbphone.changchanneldmb(12);
	}

}
