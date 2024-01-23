
public class Student extends User{
	
	private String course;
	private String college;
	
	
	public void setStudentDetails(String name, int by, String city, String course, String college)
	{
		this.setDetails(name, by, city);
		this.course=course;
		this.college=college;
				
	}
	
	public void printStudentDetails()
	{
		System.out.println("Course name is "+course);
		System.out.println("Collge name is "+ college);
	} 
	
	public void printHobby()
	{
		System.out.println("Singing,Dancing");

	}
	
}

