package company;

public class Manager extends Employee{
	private double incentive;

	public Manager() {
		
	}

	public Manager(String id, String name, int salary, String dept, double incentive) {
		super(id, name, salary, dept);
		this.incentive = incentive;
	}

	@Override
	public double salaryM() {
		// TODO Auto-generated method stub
		double money = 0;
		money = super.salaryM()+this.incentive;
		return money;
	}

	

	@Override
	public String toString() {
		return "Manager [incentive=" + incentive + ", toString()=" + super.toString() + "]";
	}

	//@Override
	/*public double annSalary() {
		double ann=0;
		ann =12*salaryM();
		return ann;
	}*/
	
	
	

}
