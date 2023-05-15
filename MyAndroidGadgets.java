package week3.day1;

public class MyAndroidGadgets extends AndroidTV implements Android{

	@Override
	public void OpenApp() {
		System.out.println("OpenApp method from Android Interface implemented in MyAndroidGadgets class");
	}

	@Override
	public void StopVideo() {
		System.out.println("StopVideo method from AndroidTV abstract class implemented in MyAndroidGadgets class");		
	}
	
	public static void main(String[] args) {
		MyAndroidGadgets myandroid = new MyAndroidGadgets();
		myandroid.OpenApp();
		myandroid.StartVideo();
		myandroid.StopVideo();

	}


	

}
