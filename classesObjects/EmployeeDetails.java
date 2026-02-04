package ClassesObjects;

public class EmployeeDetails {

	String Emp_Name = "Shivam";
	static int Emp_Id = 101;
	
	EmployeeDetails(){
		System.out.println("Employee details: ");
	}
	public void Salary() {
		System.out.println("80000");
	}
	public void Department() {
		System.out.println("Computer");
	}
	public static void main(String[] args) {
		
		EmployeeDetails emp = new EmployeeDetails();
		System.out.print("Employee Name: ");
		System.out.println(emp.Emp_Name);
		
		System.out.print("Employee Id: ");
		System.out.println(EmployeeDetails.Emp_Id);
				
		System.out.print("Employee Salary: ");
		emp.Salary();
		
		System.out.print("Employee Department: ");
		emp.Department();
	}
}
