package by.htp.les08.main;

public class Task2 {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;		
		Test2 test = new Test2();
		Test2 test1 = new Test2(a + 1, b + 1);

		System.out.println("a = " + test.getA() + "\nb = " + test.getB());
		System.out.println("a1 = " + test1.getA() + "\nb1 = " + test1.getB());
		
		test.setA(a);
		test.setB(b);
		System.out.println("a = " + test.getA() + "\nb = " + test.getB());
		
	}

}

class Test2 {
	private int a;
	private int b;
	
	Test2(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	Test2() {
		this.a = 1;
		this.b = 1;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
}