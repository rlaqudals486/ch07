package ch08;

public class ComputerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;
		
		Calculator cal = new Calculator();
		System.out.println("원 면적 : " + cal.areaCircle(r));
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("원 면적 : " + com.areaCircle(r));
		
		Computer cp = new Computer();
		cp.plus(10, 5);
		cp.minus(10, 5);
		cp.multi(10, 5);
		cp.divde(10, 5);
	}

}
