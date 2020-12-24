package ch08;

// 클래스 B에서 클래스 A를 기반으로 객체를 생성함(동일 패키지 내에서)
public class B {
	public void method() {
//		클래스를 통해서 객체를 생성한다는 것은 해당 클래스 타입의 변수를 생성하는 것
		A a = new A();
		a.field = "value";
		a.method();
	}
}
