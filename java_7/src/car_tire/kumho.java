package car_tire;

public class kumho extends tire {
	public kumho(String location, int maxrotation) {
		super(location,maxrotation);
	}
	@Override
	public boolean roll() {
		++accumulatedR;
		if(accumulatedR<maxrotation) {
			 System.out.println(location + " ��ȣŸ�̾� ����  :  " +(maxrotation-accumulatedR) + "ȸ");
			 return true;
	}else {
		 System.out.println(location + " ��ȣŸ�̾� ��ũ " );
		 return false;

	}
	}
	}
