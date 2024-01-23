import java.util.Scanner;


public class App1 {
	
	public static void main(String args[])
	{
		Student student = new Student();
		
		student.setStudentDetails("Sai", 1999, "Chennai", "ECE", "SRM");
		
		student.printDetails();
 		student.printStudentDetails();
 		student.printHobby();

	}

}
 