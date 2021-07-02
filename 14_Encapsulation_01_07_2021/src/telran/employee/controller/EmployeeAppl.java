package telran.employee.controller;


import telran.employee.model.Employee;

public class EmployeeAppl {
	public static void main(String[] args) {
		Employee john = new Employee(); //new вызывает конструктор (имя класса) 22 минута
		john.id = 1000; 
		john.name = "John Smith";
		john.salary = 20000; 
		john.netAllowance = 2.25;
		john.display();
		john.showSalary();
		
//		john.salary();
//		System.out.println(john.id);
//		System.out.println(john.name);
//		System.out.println(john.salary);
//		System.out.println(john.taxAllowance);
		Employee peter = new Employee();
		peter.id = 2000; 
		peter.name = "Peter Smith";
		peter.salary = 18000;
		peter.netAllowance = 5.25;
		peter.display();
		peter.showSalary();
	}
}
