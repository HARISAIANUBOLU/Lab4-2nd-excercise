package com.cg.eis.pl;
import java.util.Scanner;

import com.cg.eis.service.Service;
public class InputUser extends Service{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service obj= new Service();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee Id :");
		int id=sc.nextInt();
		System.out.println("Enter Employee name :");
		String name=sc.next();
		System.out.println("Enter Employee Salary :");
		double salary=sc.nextDouble();
		
		obj.empDetails(id, name, salary);
		
		System.out.println("Name	:"+obj.getName());
		System.out.println("Designation :"+obj.getDesignation());
		System.out.println("Salary      :"+obj.getSalary());
		System.out.println("Your scheme :"+obj.getinsuranceScheme());
		sc.close();

	}

}
