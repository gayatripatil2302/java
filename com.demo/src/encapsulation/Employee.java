package encapsulation;

public class Employee {
	private int id ;
	private String name;
	private double salary;
	
	//setter method
	public void setId( int id) {
		this.id = id; 
	}
	 public void setName(String name) {
		 this.name = name;
	 }
	 public void setSalary(double salary) {
		 this.salary = salary;
	 }
	 
	 //getter method
	 public int getID() {
		 return id;
	 }
	public String getName(){
		return name;	
	}
	public double getSalary() {
		return salary;
	}
	

}
