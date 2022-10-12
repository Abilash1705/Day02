package week1.day2;

public class EmployeeDetails {
	public void employeeName() {
		String employeeName="abilash M";
		System.out.println("employeeName="+employeeName);
	}
	public void empId() {
		int empId=1705;
		System.out.println("emplyeeId="+empId);
	}
	public void empAddress() {
		String empAddress="130 pudukkottai";
		System.out.println("employeeAddress="+empAddress);
	}
	public void empPhoneNumber() {
		long empPhoneNumber=6381616295L;
		System.out.println("employeePhoneNumber="+empPhoneNumber);
	}
	public void empSalary() {
		double empSalary=99999.999;
		System.out.println("employeeSalary="+empSalary);
	}
	public static void main(String[] args) {
		EmployeeDetails Details=new EmployeeDetails();
		Details.employeeName();
		Details.empAddress();
		Details.empId();
		Details.empPhoneNumber();
		Details.empSalary();
		
	}
		
		
		
		
	
	

}
