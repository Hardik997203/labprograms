package Employee;

public class Main {

	public static void main(String[] args) {
		Employee e1=new Employee("karn",547,15800);
		Employee e2=new Employee("arjun",168,14700);
		System.out.println("initial employee details are");
		e1.display();
		e2.display();
		e1.inc_salary(10);
		e2.inc_salary(10);
		System.out.println("updated employee details are");
		e1.display();
		e2.display();
		
		

	}

}