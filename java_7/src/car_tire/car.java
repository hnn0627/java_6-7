package car_tire;

public class car  {
    hankooktire frontlefttire = new  hankooktire("�տ���",2);
	hankooktire frontrightttire = new  hankooktire("�տ�����",6);
	hankooktire backrightttire = new hankooktire("�ڿ�����",3);
	hankooktire backleftttire = new hankooktire("�ڿ���",4);

int run() {
	System.out.println("�ڵ����� �޸��ϴ�.");
	if(frontlefttire.roll()==false) {stop(); return 1;}
	if(frontrightttire.roll()==false) {stop(); return 2;}
	if(backleftttire.roll()==false) {stop(); return 3;}
	if(backrightttire.roll()==false) {stop(); return 4;}
	return 0;
}

void stop() {
	System.out.println("�ڵ����� �����մϴ�.");
}
	
}

			
