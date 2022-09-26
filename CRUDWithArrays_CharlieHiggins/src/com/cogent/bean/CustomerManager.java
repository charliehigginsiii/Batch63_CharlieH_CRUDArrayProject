package com.cogent.bean;

import java.util.Scanner;

import com.cogent.controller.CustomerRepo;
import com.cogent.repo.CustomerBean;

public class CustomerManager {
	public static void main(String[]args) {
		new CustomerRepo().runProgram();
	}

}
