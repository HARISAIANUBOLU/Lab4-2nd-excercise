package com.cg.eis.service;
import com.cg.eis.bean.Employee;
interface EmployeeService{
	public void empDetails(Integer id, String name,double salary);
	public String findScheme();
	public void display();
}
public class Service extends Employee implements EmployeeService{
	public void empDetails(Integer id, String name,double salary){
		super.setId(id);
		super.setName(name);
		super.setSalary(salary);
		findScheme();
		}
		public String findScheme(){
			StringBuffer insuranceScheme = new StringBuffer("");
			StringBuffer designation = new StringBuffer("");
			
			if(super.getSalary()>=15000&&super.getSalary()<30000){
				insuranceScheme.append("Scheme E");
				designation.append("System Associate");
			}
			else if(super.getSalary()>=30000&&super.getSalary()<60000){
				insuranceScheme.append("Scheme D");
				designation.append("Programmer");
			}
			else if(super.getSalary()>=60000&&super.getSalary()<80000){
				insuranceScheme.append("Scheme C");
				designation.append("Manager");
			}
			else if(super.getSalary()>=80000&&super.getSalary()<=100000){
					insuranceScheme.append("Scheme B");
					designation.append("President");
			}
					else if(super.getSalary()>100000){
						insuranceScheme.append("Scheme A");
						designation.append("CEO");
						
			}
			else{
				insuranceScheme.append("NO Scheme");
				designation.append("Clerk");
			}
			super.setinsuranceScheme(insuranceScheme.toString());
			super.setDesignation(designation.toString());
			return super.getinsuranceScheme();
		}
		public void display(){
			
		}

}
