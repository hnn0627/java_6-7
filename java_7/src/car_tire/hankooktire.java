package car_tire;

public class hankooktire extends tire {
public hankooktire(String location, int maxrotation) {
	super(location,maxrotation);
}
@Override
public boolean roll() {
	++accumulatedR;
	if(accumulatedR<maxrotation) {
		 System.out.println(location + " �ѱ�Ÿ�̾� ����  :  " +(maxrotation-accumulatedR) + "ȸ");
		 return true;
}else {
	 System.out.println(location + " �ѱ�Ÿ�̾� ��ũ " );
	 return false;

}

}
}
