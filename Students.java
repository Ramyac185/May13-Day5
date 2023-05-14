package week3.day1;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Student Id alone in this method");
		System.out.println(id);
		System.out.println("*************************************************");
	}

	public void getStudentInfo(int id,String name) {
		System.out.println("Student Id and Name are present in this method");
		System.out.println(id+" "+name);
		System.out.println("***************************************************");
	}
	

	public void getStudentInfo(String email,long phoneNumber) {
		System.out.println("Student email and phoneNumber are present in this method");
		System.out.println(email+" "+phoneNumber);
	}
	
	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(1234);
		stud.getStudentInfo(5678, "Ramya");
		stud.getStudentInfo("ramyasakthi2@gmail.com", 987521387);
		
	}

}
