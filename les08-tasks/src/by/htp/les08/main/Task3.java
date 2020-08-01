package by.htp.les08.main;

public class Task3 {

	public static void main(String[] args) {
		Counter counter1 = new Counter();
		Counter counter2 = new Counter(10);
		Counter counter3 = new Counter(1, 10, 5);
		
		System.out.println("Первый счётчик: " + counter1.getValue());
		System.out.println("Второй счётчик: " + counter2.getValue());
		System.out.println("Третий счётчик: " + counter3.getValue());

		if (counter1.increase()) {
			System.out.println("Первый счётчик успешно увеличен!");
		} else {
			System.out.println("Первый счётчик не был увеличен!");
		}
		System.out.println("Первый счётчик: " + counter1.getValue());
		
		if (counter2.decrease()) {
			System.out.println("Второй счётчик успешно уменьшен!");
		} else {
			System.out.println("Второй счётчик не был уменьшен!");
		}
		System.out.println("Второй счётчик: " + counter2.getValue());

		for (int i = 0; i < 5; i++) {
			if (counter3.decrease()) {
				System.out.println("Третий счётчик успешно уменьшен!");
			} else {
				System.out.println("Третий счётчик не был уменьшен!");
			}
			System.out.println("Третий счётчик: " + counter3.getValue());
		}
	}

}

class Counter {
	private int value;
	private int maxValue = 100;
	private int minValue = 0;
	
	Counter() {
		value = minValue;
	}
	
	Counter(int value) {
		this.value = value;
	}
	
	Counter(int minValue, int maxValue, int value) {
		if (maxValue >= minValue) {
			this.minValue = minValue;
			this.maxValue = maxValue;
		}
		this.value = value;
	}
	
	public boolean increase() {
		if (value + 1 > maxValue) {
			return false;
		} else {
			value++;
			return true;
		}
	}
	
	public boolean decrease() {
		if (value - 1 < minValue) {
			return false;
		} else {
			value--;
			return true;
		}
	}
	
	public int getValue() {
		return value;
	}
}