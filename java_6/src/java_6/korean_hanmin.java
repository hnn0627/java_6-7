package java_6;

public class korean_hanmin {
 public static void main(String[] args) {
	 
	 korean k1 = new korean("서한민","950627-1234567","한국");
	 System.out.println("k1.name : "+k1.name);
	 System.out.println("k1.ssn : "+k1.ssn);
	 System.out.println("k1.nation : "+k1.nation);

	 korean k2 = new korean("미니","123232-5465654", "미국");
	 System.out.println("k2.ssn : "+k2.ssn);
	 System.out.println("k2.name : "+k2.name);
	 System.out.println("k2.nation : "+k2.nation);
	 
 }
}
