package com.cogent.controller;

import java.util.Scanner;

import com.cogent.bean.CustomerBean;
import com.cogent.repo.CustomerRepo;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 26, 2022
 */
public class CustomerManager {
	public static void main(String[]args) {
		new CustomerRepo().runProgram();
		//CustomerRepo customers=new CustomerRepo();
		//customers.addCustomer(new CustomerBean("Mark",1));
		//customers.addCustomer(new CustomerBean("Joe",2));
		//customers.print();
	}

}
