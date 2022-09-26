package com.cogent.repo;

import java.util.Scanner;

import com.cogent.bean.CustomerBean;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 26, 2022
 */
public class CustomerRepo {
	int size=0;
	CustomerBean[] arr=new CustomerBean[0];
	
	//API Methods
	public void addCustomer(CustomerBean customerBean) {
		CustomerBean[] newarr=new CustomerBean[arr.length+1];
		for(int i=0;i<newarr.length;i++) {
			newarr[i]=customerBean;
		}
		if(arr.length==0) {
			arr=newarr;
		}else {
			CustomerBean[] mergedarray=new CustomerBean[arr.length+newarr.length];
			for(int i=0;i<arr.length;i++) {
				mergedarray[i]=arr[i];
			}
			int l=0;
			String added="";
			for(int i=arr.length;i<mergedarray.length;i++) {
				if(added.contains(newarr[l].toString())) {
					mergedarray[i]=new CustomerBean("",0);
				}else {
					mergedarray[i]=newarr[l];
					added+=newarr[l];
				}
				
				l++;
			}
			arr=mergedarray;
			
		}
	}
	public CustomerBean[] viewAllCustoemrs() {
		return arr;
	}
	public CustomerBean searchCustomerById(long id) {
		CustomerBean customer=null;
		for(int i=0;i<arr.length;i++) {
			if(id==arr[i].getCustomerId()) {
				customer=arr[i];
				break;
			}else {
				customer=new CustomerBean("Customer does not exist",0);
			}
		}
		return customer;
		
	}
	//End API Methods
	
	//Method to run program
	public void runProgram() {
		boolean runprogram=true;
		int choice=0;
		while(runprogram) {
			if(choice==0) {
				for(int i=0;i<77;i++) {
					if(i<36) {
						System.out.print("* ");
					}else if(i>=36&&i<37) {
						System.out.println();
						System.out.println("Customer Management System");
					}else if(i>=37&&i<73) {
						System.out.print("* ");
					}else if(i==73) {
						System.out.println();
						System.out.println("1. Add Customer");
					}else if(i==74) {
						System.out.println("2. View All Customer");
					}else if(i==75) {
						System.out.println("3. Search Customer by Id");
					}else if(i==76) {
						System.out.println("4. Exit");
					}
				}
				System.out.println("Enter Number: ");
			}
			
			if(choice==0) {
				int number=new Scanner(System.in).nextInt();
				choice=number;
			}
			switch(choice) {
			case 1:
				System.out.println("Enter Customer Name: ");
				String customername=new Scanner(System.in).nextLine();
				System.out.println("Enter ID: ");
				long customerid=new Scanner(System.in).nextLong();
				addCustomer(new CustomerBean(customername,customerid));
				System.out.println("Do you want to enter another customer?Y or N");
				String yesorno1=new Scanner(System.in).nextLine();
				if(yesorno1.contentEquals("Y")) {
					choice=1;
				}else {
					choice=0;
					continue;
				}
				break;
			case 2:
				CustomerBean[] arr=viewAllCustoemrs();
				System.out.println("Name"+" | "+"Id");
				for(int i=0;i<arr.length;i++) {
					if(!arr[i].getCustomerName().contentEquals("")) {
						System.out.println(arr[i].getCustomerName()+" | "+arr[i].getCustomerId());
					}
				}
				System.out.println("Enter Y to contionue and enter N to exit program ");
				String yesorno2=new Scanner(System.in).nextLine();
				if(yesorno2.contentEquals("N")) {
					runprogram=false;
				}else {
					choice=0;
					continue;
				}
				break;
			case 3:
				System.out.println("Enter Customer ID: ");
				long id=new Scanner(System.in).nextLong();
				CustomerBean thecustomer=searchCustomerById(id);
				System.out.println(thecustomer.getCustomerName());
				System.out.println("Do you want to search more?Y or N");
				String yesorno3=new Scanner(System.in).nextLine();
				if(yesorno3.contentEquals("Y")) {
					choice=3;
				}else {
					choice=0;
					continue;
				}
				break;
			case 4:
				runprogram=false;
				break;
			
			}
		}
	}

}
