package constructor;

public class Constuctors {
	
	         //WELCOME MSG
	//public static void main (String []args) {
	//	Welcome w1 = new Welcome();
	//}
	
	       //STUDENT 
	//public static void main (String []args) {
	//	Student s1 = new Student(45,"gayatri","computer");
	//	System.out.println(s1.rollNum);
	//	System.out.println(s1.name);
	//	System.out.println(s1.branch);
	//
	//	Student s2 = new Student(12,"riya","electrical");
    //		System.out.println(s2.rollNum);
	//	System.out.println(s2.name);
	//	System.out.println(s2.branch);
//	}
	
	
	
	           //BOOK
	//public static void main (String[]args) {
	//	Book b1 = new Book("yayati", 101);
	//	System.out.println(b1.bookName);
	//	System.out.println(b1.bookId);
		
	//	Book b2 = new Book("chhava", 101,"shivaji sawant",459);
	//	System.out.println(b2.bookName);
	//	System.out.println(b2.bookId);
	//	System.out.println(b2.author);
	//	System.out.println(b2.price);	
//	}
	
	          
	       // EMPLOYEE
	public static void main(String []args) {
		Employee e1 = new Employee("gayatri",101,20000);
		System.out.println(e1.empName);
		System.out.println(e1.empId);
		System.out.println(e1.salary);
		System.out.println(Employee.companyName);
		
		System.out.println();
		Employee e2 = new Employee("riya",102,255000);
		System.out.println(e2.empName);
		System.out.println(e2.empId);
		System.out.println(e2.salary);
		System.out.println(Employee.companyName);
		
		
		
		
		
		
		
	
	}

	
	
	
	
	
	
	
	
	
}
