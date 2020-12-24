package ch08_1;

public class HankookTire extends Tire {

//	HankookTire 클래스의 생성자
	public HankookTire(String location, int maxRotation) {
//	super() 부모 클래스의 생성자를 호출, 부모 클래스에서 기본 생성자를
//		구현하지 않고 다른 생성자만 사용했을 경우 suepr(매개변수, ...) 형식으로 부모 클래스의 생성자를 직접 호출해야 함
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		}
		else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
}
