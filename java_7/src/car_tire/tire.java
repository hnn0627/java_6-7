package car_tire;

public class tire {
 int maxrotation;
 int accumulatedR;
 String location;
 
 public tire(String location, int maxrotation) {
	 this.location =location;
	 this.maxrotation = maxrotation;
 }
 public boolean roll() {
	 ++accumulatedR;
	 if(accumulatedR<maxrotation) {
		 System.out.println(location + " 타이어 수명  :  " +(maxrotation-accumulatedR) + "회");
		 return true;
 }else {
	 System.out.println(location + " 타이어 펑크 " );
	 return false;
 }
 }
 
}
