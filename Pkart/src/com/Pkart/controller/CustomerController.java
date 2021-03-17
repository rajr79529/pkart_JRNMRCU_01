package com.Pkart.controller;

import java.util.List;
import java.util.Scanner;
import com.Pkart.model.Customer;
import com.Pkart.model.Product;
import com.Pkart.service.CartServiceImpl;
import com.Pkart.service.CustomerServiceImpl;
import com.Pkart.service.ICartService;
import com.Pkart.service.ICustomerService;

public class CustomerController {

	private static ICustomerService customerService = new CustomerServiceImpl();
	private static ICartService cartService = new CartServiceImpl();
	public void operations() {
		boolean status = true;

		while(status)
		{
			System.out.println("welcome to home screen");
			System.out.println("1.Register \n 2. View Customer\n 3.View orders\n 4. Purchase product\n 5. ViewCart \n 6. exit");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Eneter id, name, email, phone no, addresss");
					int id = scanner.nextInt();
					String name = scanner.next();
					String email = scanner.next();
					String phoneNo = scanner.next();
					String address = scanner.next();
					Customer customer  = new Customer();
					customer.setId(id);
					customer.setName(name);
					customer.setEmail(email);
					customer.setPhoneNo(phoneNo);
					customer.setAddress(address);
					if (customerService.addCustomer(customer)) {
						System.out.println("Welcome to PKart "+ customer.getName());
					} else {
						System.out.println(" Try Again.");
					}
					
					break;
				case 2:
					System.out.println("enter  Customer id:");
					int id1  = scanner.nextInt();
					Customer customer1 = customerService.viewCustomer(id1);
					System.out.println(customer1);
					break;
				case 3:
					List<Product> allProducts1 = cartService.viewCart();
					for (Product Product : allProducts1)
				      { 		      
				           System.out.println(Product); 		
				      }
					break;
				case 4:
					List<Product> allProducts = customerService.purchaseProduct();
					
					for (Product Product : allProducts)
				      { 		      
				           System.out.println(Product); 		
				      }
					System.out.println("enter  Product id for Purchasing:");
					int id2 = scanner.nextInt();
					Product p1 = new Product();
					p1.setId(id2);
					List<Product> allProducts3 = customerService.purchaseProduct();
					for (Product Product : allProducts3)
				      { 	
						if(id2 ==  Product.getId() )
						{
							p1 = Product;
							System.out.println("Product Added Successfuly");
						}
							
				      }
					
					
					 cartService.addToCart(p1);
					break;
				case 5:
					List<Product> allProducts11 = cartService.viewCart();
					for (Product Product : allProducts11)
				      { 		      
				           System.out.println(Product); 		
				      }
					break;
				case 6:
					System.out.println("Logout");
					status = false;

				}
				
				
			}
		}
}