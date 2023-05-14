package week3.day1;

public class MyPhone {

	public static void main(String[] args) {
		Iphone iph = new Iphone();
		iph.startApp();
		iph.increaseVolume();
		iph.shutDown();
		iph.makeCall();
		iph.sendSMS();
		
		Ipad ip = new Ipad();
		ip.watchMovie();
	}

}
