package company;

public class company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 =
				new Employee("11","James",1000,"Dev");
		System.out.println(e1);
		System.out.println(e1.salaryM());
		System.out.println(e1.annSalary());
		
		Manager m1=
				new Manager("22","Tom",1000,"Dev",100);
		System.out.println(m1);
		System.out.println(m1.salaryM());
		System.out.println(m1.annSalary());


	}// Employee�� toString ����� �� ����. Manager�� toString�� ���� �־����.
	//=overide ������

}
