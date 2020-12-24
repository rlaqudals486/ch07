package ch08;


// 문제 3) Calculator 클래스를 상속받아 사칙연산을 하는 프로그램을 작성하시오.
// 조건 1. Computer 클래스가 Calculator 클래스를 상속받음
// 조건 2. 사칙 연산 메서드를 모두 override 함
// 조건 3. Computer 클래스에는 화면에 결과를 프린트 하기 위한 printer() 메서드가 존재함
// 조건 4. 오버라이딩한 메서드는 printer() 메서드를 사용하여 결과를 출력함
// 조건 5. printer() 메서드는 매개변수를 2개 입력받고, 그 중 1개를 이용하여
//	사칙연산 중 어떤 것인지 판단하여 화면에 결과를 출력
public class Calculator {
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
	public int multi(int x, int y) {
		return x * y;
	}
	
	public int divde(int x, int y) {
		return x / y;
	}
}
