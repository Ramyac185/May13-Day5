package week3.day1;

public class SmartPhone extends AndroidPhone{
	public void takeVideo() {
		System.out.println("TakeVideo method from AndroidPhone class to access in SmartPhone class");
	}

	public static void main(String[] args) {
//		AndroidPhone android = new AndroidPhone();
		SmartPhone smart = new SmartPhone();
		smart.takeVideo();
	}

}
