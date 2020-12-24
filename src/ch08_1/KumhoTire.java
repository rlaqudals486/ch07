package ch08_1;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
//	오버라이딩을 하겠다는 어노테이션
	@Override
	public boolean roll() {
		++accumulatedRotation;
//		오버라이딩을 통해서 내용 변경
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire 수명 : " + (maxRotation - accumulatedRotation));
			return true;
		}
		else {
			System.out.println("*** " + location + "KumhoTire 펑크 ***");
			return false;
		}
	}
}
