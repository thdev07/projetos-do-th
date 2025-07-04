package entities;

public class Employee {
	
	public String Name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		
		return grossSalary - tax;	
	}
	
	public void increaseSalary(double percentage) {
		
		grossSalary += grossSalary * (percentage / 100);
		
	}
	
	public String toString() {
		
				return "Employee: "
				+ Name		
				+ ", $"
				+ String.format("%.2f", netSalary());
	}
	

}
