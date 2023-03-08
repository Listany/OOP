import java.util.Scanner;

public class User{
	private String name;
	
	public User(String name){
		this.name = name;
	}


	
	public String getName(){
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void save(){
		Persister persister = new Persister(this);
		persister.save();
	}

	public void report(){
		Report report = new Report(this);
		report.report();
	}

	private String prompt(String message) {
		Scanner in = new Scanner(System.in);
		System.out.print(message);
		return in.nextLine();
	}

}