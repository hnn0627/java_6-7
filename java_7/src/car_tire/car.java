package car_tire;

public class car  {
    hankooktire frontlefttire = new  hankooktire("앞왼쪽",2);
	hankooktire frontrightttire = new  hankooktire("앞오른쪽",6);
	hankooktire backrightttire = new hankooktire("뒤오른쪽",3);
	hankooktire backleftttire = new hankooktire("뒤왼쪽",4);

int run() {
	System.out.println("자동차가 달립니다.");
	if(frontlefttire.roll()==false) {stop(); return 1;}
	if(frontrightttire.roll()==false) {stop(); return 2;}
	if(backleftttire.roll()==false) {stop(); return 3;}
	if(backrightttire.roll()==false) {stop(); return 4;}
	return 0;
}

void stop() {
	System.out.println("자동차가 정지합니다.");
}
	
}

			
