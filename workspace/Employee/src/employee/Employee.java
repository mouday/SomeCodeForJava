package employee;

public class Employee {
	private String name;
	private int age;
	private double salary;
	public Employee(String name,int age, double salary) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public String getName(){
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee[]={
				new Employee("Jack",23,3400.0),
				new Employee("Tom",24,3500.0),
				new Employee("Jhon",25,3600.0)
		};
		for(int i=0;i<employee.length;i++){
			//System.out.println(employee[i].getName());
			System.out.println(employee[i].name);
		}
		A a=new A("小明");
		System.out.println(a.getName());
	}

}
