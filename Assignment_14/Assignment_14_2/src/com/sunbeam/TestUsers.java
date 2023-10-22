package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestUsers {
	public  static int menu() {
		int choice;
		System.out.println("****************** Menu ******************");
		System.out.println("0. EXIT \n"
				+"1. Add new user.\n"
				+ "2. Display all users.\n"
				+ "3. Update user name and status. \n"
				+ "4. Delete a user.\n"				
				);
		System.out.println("******************************************");

		System.out.println("Enter your choice :");
		choice=new Scanner(System.in).nextInt();
		return choice;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int cnt,choice;
		
		while((choice=menu())!=0) {
			switch(choice) {
			case 1:

				//Create user 
				try(UserDao udb=new UserDao())
				{
					Users user=new Users();
					user.accept(sc);
					cnt=udb.save(user);
					System.out.println("Total rows inserted : "+cnt);
				}catch(Exception e) {
					e.printStackTrace();
				}

				break;
			case 2:
				//Read user
				List<Users> userslist=new ArrayList<>();
				try(UserDao udb=new UserDao()){
					userslist=udb.read();
					for(Users user:userslist) {
						System.out.println(user);
					}
				} 
				catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				break;
			case 3 :
				
				//update user
				try(UserDao udb=new UserDao()){
					Users user=new Users();
					System.out.println("Enter user id to update its Fname ,Status : ");
					user.setId(sc.nextInt());
					sc.nextLine();
					System.out.println("Enter new First name : ");
					user.setFname(sc.nextLine());
					System.out.println("Enter new status true or false : ");
					user.setStatus(sc.nextBoolean());
					cnt=udb.update(user);
					System.out.println("Total rows updated : "+cnt);
				} catch (Exception e)
				{
					e.printStackTrace();
				} 
				
				break;	
			case 4: 
				
				//Delete user
				try(UserDao udb=new UserDao())
				{
					System.out.println("Enter user id to be deleted : ");	
					cnt=udb.delete(sc.nextInt());
					System.out.println("Total users Deleted : "+cnt);
				}
				catch (Exception e) {
					e.printStackTrace();
					}
				break;
			
			}//switch
		}//while	
		
	}//main
}//class
	
	
	

		
		
		
		
		
		
		
		
		
