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
	}

}
