
import java.util.Scanner;

public class User {
	
	private String name;
	private int by;
	private String city;
	
	public void setDetails(String name,int by,String city)
	{
		this.name=name;
		this.by=by;
		this.city=city;

	}
	
	public void printDetails()
	{
		System.out.println("The name is "+name);
		System.out.println("The age is "+(2024-by));
		System.out.println("The city is "+city);
		
	}
	
	public void printHobby()
	{
		System.out.println("Singing");

	}
}
