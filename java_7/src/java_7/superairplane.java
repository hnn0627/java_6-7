package java_7;

public class superairplane extends airplane {
public static final int nomal =1;
public static final int supersonic =2;

public int flymode = nomal;

@Override
public void fly() {
	if (flymode == supersonic) {
		System.out.println("������ �����մϴ�.");
	}else {
		super.fly();
	}
}

}
