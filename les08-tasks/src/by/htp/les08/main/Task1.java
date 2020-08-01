package by.htp.les08.main;

public class Task1 {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		Test1 test = new Test1();
		
		test.setA(a);
		test.setB(b);
		test.output();
		System.out.println("max = " + test.max() + "\nsum = " + test.sum());
	}

}

class Test1 {
	private int a;
	private int b;
	
	public void output() {
		System.out.println("a = " + a + "\nb = " + b);
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public int sum() {
		return a + b;
	}
	
	public int max() {
		return (a > b) ? a : b;
	}
}