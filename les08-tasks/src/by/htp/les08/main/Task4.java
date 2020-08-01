package by.htp.les08.main;

public class Task4 {

	public static void main(String[] args) {
		Time time = new Time();
		
		printTime(time);
		time.increase(1, 1, 1);
		printTime(time);
		time.decrease(1, 1, 1);
		printTime(time);
		time.increase(14, 10, 1);
		printTime(time);
		time.decrease(0, 11, 0);
		printTime(time);
		time.increase(0, 0, 59);
		printTime(time);
		
		if (time.increase(0, 0, 3600)) {
			System.out.println("Время успешно переведено вперёд!");
		} else {
			System.out.println("Время не было переведено вперёд! Перевод возможен только на положительную величину!");
		}
		printTime(time);
		
		if (time.decrease(0, -120, 0)) {
			System.out.println("Время успешно переведено назад!");
		} else {
			System.out.println("Время не было переведено назад! Перевод возможен только на положительную величину!");
		}
		printTime(time);
		
		time.decrease(0, 120, 0);
		printTime(time);
	}
	
	public static void printTime(Time time) {
		System.out.print("Время: ");
		if (time.getHours() < 10) {
			System.out.print("0" + time.getHours() + ":");
		} else {
			System.out.print(time.getHours() + ":");
		}
		
		if (time.getMinutes() < 10) {
			System.out.print("0" + time.getMinutes() + ":");
		} else {
			System.out.print(time.getMinutes() + ":");
		}
		
		if (time.getSeconds() < 10) {
			System.out.println("0" + time.getSeconds());
		} else {
			System.out.println(time.getSeconds());
		}
	}
}

class Time {
	private int hours;
	private int minutes;
	private int seconds;
	
	Time() {
		hours = 10;
		minutes = 0;
		seconds = 0;
	}
	
	Time(int hours, int minutes, int seconds) {
		if (hours < 24 && hours >= 0) {
			this.hours = hours;
		} else {
			hours = 0;
		}
		
		if (minutes < 60 && minutes >= 0) {
			this.minutes = minutes;
		} else {
			minutes = 0;
		}
		
		if (seconds < 60 && seconds >= 0) {
			this.seconds = seconds;
		} else {
			seconds = 0;
		}
	}

	public void setHours(int hours) {
		if (hours < 24 && hours >= 0) {
			this.hours = hours;
		} else {
			hours = 0;
		}
	}
	
	public int getHours() {
		return hours;
	}

	public void setMinutes(int minutes) {
		if (minutes < 60 && minutes >= 0) {
			this.minutes = minutes;
		} else {
			minutes = 0;
		}
	}
	
	public int getMinutes() {
		return minutes;
	}

	public void setSeconds(int seconds) {
		if (seconds < 60 && seconds >= 0) {
			this.seconds = seconds;
		} else {
			seconds = 0;
		}
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public boolean increase(int extraHours, int extraMinutes, int extraSeconds) {
		if (extraHours >= 0 && extraMinutes >= 0 && extraSeconds >= 0) {
			int carries = 0;
			
			seconds = seconds + extraSeconds;
			while (seconds > 59) {
				seconds -= 60;
				carries++;
			}
			
			minutes = minutes + extraMinutes + carries;
			carries = 0;
			while (minutes > 59) {
				minutes -= 60;
				carries++;
			}
			
			hours = hours + extraHours + carries;
			while (hours > 23) {
				hours -= 24;
			}
						
			return true;
		}
		return false;
	}
	
	public boolean decrease(int exHours, int exMinutes, int exSeconds) {
		if (exHours >= 0 && exMinutes >= 0 && exSeconds >= 0) {
			int carries = 0;
			
			seconds = seconds - exSeconds;
			while (seconds < 0) {
				seconds += 60;
				carries++;
			}
			
			minutes = minutes - exMinutes - carries;
			carries = 0;
			while (minutes < 0) {
				minutes += 60;
				carries++;
			}
			
			hours = hours - exHours - carries;
			while (hours < 0) {
				hours += 24;
			}
						
			return true;
		}
		return false;
	}
}