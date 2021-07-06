package telran.employee.controller;

import telran.employee.model.Employee;

public class EmployeeAppl {
	public static void main(String[] args) {
		Employee john = new Employee(1000, "John Smith", 20000, 2.25); //new вызывает конструктор (имя класса) 22 минута
		Employee peter = new Employee (2000, "Peter Smith", 18000, 5.25);
//		john.id = 1000; 
//		john.name = "John Smith";
		double totalSalary = john.getSAlary() + peter.getSAlary();
		System.out.println(totalSalary);
		john.setSalary(-100); 
//		john.netAllowance = 2.25;
		john.display();
		john.showSalary();
		
//		john.salary();
//		System.out.println(john.id);
//		System.out.println(john.name);
//		System.out.println(john.salary);
//		System.out.println(john.taxAllowance);
		
//		peter.id = 2000; 
//		peter.name = "Peter Smith";
//		peter.salary = 18000;
//		peter.netAllowance = 5.25;
		peter.display();
		peter.showSalary();
	}
}
