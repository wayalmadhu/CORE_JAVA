//Question41
class Employee{
	private int empId;
	private String empName;
	void set(int empId,String empName){
		this.empId = empId;
		this.empName = empName;
	}
	void show(){
		System.out.println(empId+" "+empName);
	}
}
class EmployeeDemo{
	public static void main(String args[]){
		Employee e = new Employee();
		e.set(101,"abc");
		e.show();
		Employee e1 = new Employee();
		e1.set(102,"xyz");
		e1.show();
	}
}