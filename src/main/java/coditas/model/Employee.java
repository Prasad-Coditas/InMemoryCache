package coditas.model;

public class Employee {

	private Integer employeeId;
	private String employeeName;
	private Double salary;
	private String email;

	public Employee() {
	}

	public Employee(Integer employeeId, String employeeName, Double salary, String email) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.email = email;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public Double getSalary() {
		return salary;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Employee{" +
				"employeeId=" + employeeId +
				", employeeName='" + employeeName + '\'' +
				", salary=" + salary +
				", email='" + email + '\'' +
				'}';
	}
}
