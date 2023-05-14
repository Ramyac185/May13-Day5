package week3.day1;

public class Automation extends MultipleLanguage{

	public void Java() {
		System.out.println("Java method is implemented in Automation class");
	}

	public void Selenium() {
		System.out.println("Selenium method is implemented in Automation class");		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby method is implemented in Automation class");		
		
	}

	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.Java();
		auto.Selenium();
		auto.ruby();
		auto.python();
	}

	

}
