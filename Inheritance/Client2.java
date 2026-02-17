package Inheritance;

class Employee{
	int salary = 30000;
	
	void work() {
		System.out.println("Employee is working!");
	}
}

class Manager extends Employee{
	int bonus = 10000;
	
	void manage() {
		System.out.println("Manager is managing team.");
	}
}

class Client2 {

	public static void main(String[] args) {
		
		Manager m = new Manager();
		Employee emp = new Employee();
		
		System.out.println("Total Salary: "+(m.salary+m.bonus));
		
		emp.work();
	
		m.work();
		m.manage();
	}
}
