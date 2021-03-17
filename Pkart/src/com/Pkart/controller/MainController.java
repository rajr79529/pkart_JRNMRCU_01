/*
It is our main Display where User gets 3 options to work on.

*/
package com.Pkart.controller;

import java.util.Scanner;

import com.Pkart.util.InputUtil;

public class MainController {

	public static void main(String[] args) {

		runApplication();                                 //calling runApplication

	}

	private static void runApplication() {

		Scanner scanner = InputUtil.getScanner();            //scanner object
		System.out.println("------WELCOME TO PKart-------");
		System.out.println("1. Customer \n 2.Admin \n   3.Exit");

		System.out.println("Enter your choice:");
		int choice = scanner.nextInt();                        

		switch (choice) {

		case 1:
			CustomerController customerController = new CustomerController();
			customerController.operations();     //calling operations method of CustomerController
			break;

		case 2:
			AdminController adminController = new AdminController();
			adminController.operations();       //calling operations of AdminController
			break;
		case 3:
			System.out.println("logout..!");      //Printing logout
			System.exit(1);
            MainController.runApplication();
		}

	}
}
