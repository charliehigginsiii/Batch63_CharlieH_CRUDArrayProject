package com.cogent.bean;

import java.util.Scanner;

import com.cogent.controller.CustomerRepo;
import com.cogent.repo.CustomerBean;

public class CustomerManager {
	public static void main(String[]args) {
		/*CustomerRepo customers=new CustomerRepo();
		CustomerBean customer1=new CustomerBean("Mark",1);
		CustomerBean customer2=new CustomerBean("Jack",2);
		CustomerBean customer3=new CustomerBean("Alex",3);
		customers.addCustomer(customer1);
		customers.addCustomer(customer2);
		customers.addCustomer(customer3);
		customers.print();*/
		new CustomerRepo().runProgram();
	}

}
