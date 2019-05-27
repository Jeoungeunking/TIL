package company;

public class Employee {
	private String id;
	private String name; 
	private int salary;
	private String dept;//하위클래스에서 자유롭게 접근가능(같은 패키지에서도..)
	
	public Employee() {
		
	}
	public Employee(String id, String name, int salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	public double salaryM() {
		//4대보험8.4% 공제
		//세금 3.2% 공제
		double money=0;
		double temp = 0;
		temp += this.salary*0.084;
		temp += this.salary*0.032;
		money = this.salary - temp;
		
		return money;
	}
	public double annSalary() {
		double ann=0;
		ann =12*this.salaryM();//e1일때는 employee의 salary, m1일때는 manager의 salary
		return ann;
	}

}
