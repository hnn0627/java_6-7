package java_6;

public class car_ex {
public static void main(String[]args) {
	
	 carthis c1 = new carthis();
	 System.out.println("c1.company : "+c1.company);
	 
	 carthis c2 = new carthis("G80");
	 System.out.println("c2.company : "+c2.company);
	 System.out.println("c2.model : "+c2.model);

	 carthis c3 = new carthis("grandeur","ÆÄ¶û");
	 System.out.println("c3.company : "+c3.company);
	 System.out.println("c3.color : "+c3.color);
	 System.out.println("c3.modle : "+c3.model);
}


}
