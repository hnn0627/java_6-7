package car_tire;

public class hankooktire extends tire {
public hankooktire(String location, int maxrotation) {
	super(location,maxrotation);
}
@Override
public boolean roll() {
	++accumulatedR;
	if(accumulatedR<maxrotation) {
		 System.out.println(location + " 한국타이어 수명  :  " +(maxrotation-accumulatedR) + "회");
		 return true;
}else {
	 System.out.println(location + " 한국타이어 펑크 " );
	 return false;

}

}
}
