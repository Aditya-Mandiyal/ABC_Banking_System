package com.godigit.banking;
import java.util.Scanner;
class ABCbank{
	    private String accountNumber;  
	    private String name;  
	    private String accountType;  
	    private long balance;
	    Scanner sc=new Scanner(System.in);
	    
	    
	    public void openAccount() {  
	        System.out.print("Account No: ");  
	        accountNumber = sc.next();  
	        System.out.print("Account type: ");  
	        accountType = sc.next();  
	        System.out.print("Enter Name: ");  
	        name = sc.next();  
	        System.out.print("Enter Balance: ");  
	        balance = sc.nextLong();  
	    }  
	    
	    
	    
	    public void showAccount() {  
	        System.out.println("Name of account holder: " + name);  
	        System.out.println("Account no.: " + accountNumber);  
	        System.out.println("Account type: " + accountType);  
	        System.out.println("Balance: " + balance);  
	    }  
	    
	    
	      
	    public void deposit() {  
	        long depositAmount;  
	        System.out.println("Enter the amount you want to deposit: ");  
	        depositAmount = sc.nextLong();  
	        balance = balance + depositAmount;  
	    }  
	    
	    
	    
	    public void withdrawal() {  
	        long withdrawalAmount;  
	        System.out.println("Enter the amount you want to withdraw: ");  
	        withdrawalAmount = sc.nextLong();  
	        if (balance >= withdrawalAmount) {  
	            balance = balance - withdrawalAmount;  
	            System.out.println("Balance after withdrawal: " + balance);  
	        } else {  
	            System.out.println("Your balance is less than " + withdrawalAmount + "\tTransaction failed...!!" );  
	        }  
	    }  
	    
	    
	    
	    public boolean search(String accountNumber) {  
	        if (accountNumber.equals(accountNumber)) {  
	            showAccount();  
	            return (true);  
	        }  
	        return (false);  
	    }  
	  
}
public class Bank {
	    public static void main(String[] args){
	    
	    	 Scanner sc = new Scanner(System.in);  
	         
	         
	         System.out.print("How many number of customers do you want to input? ");  
	         int n = sc.nextInt();  
	         ABCbank arrayOfObjects[] = new ABCbank[n];  
	         for (int i = 0; i < arrayOfObjects.length; i++) {  
	             arrayOfObjects[i] = new ABCbank();  
	             arrayOfObjects[i].openAccount();  
	         } 
	         
	         
	         
	         int key=0;  
	         while(key!=5){  
	             System.out.println("\n *** WELCOME IN ABC BANK ***");  
	             System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
	             System.out.println("Enter your choice: ");  
	             key = sc.nextInt();  
	                 switch (key) {  
	                     case 1:  
	                         for (int i = 0; i < arrayOfObjects.length; i++) {  
	                             arrayOfObjects[i].showAccount();  
	                         }  
	                         break;  
	                     case 2:  
	                         System.out.print("Enter account no. you want to search: ");  
	                         String ac_no = sc.next();  
	                         boolean found = false;  
	                         for (int i = 0; i < arrayOfObjects.length; i++) {  
	                             found = arrayOfObjects[i].search(ac_no);  
	                             if (found) {  
	                                 break;  
	                             }  
	                         }  
	                         if (!found) {  
	                             System.out.println("Account doesn't exist..!!");  
	                         }  
	                         break;  
	                     case 3:  
	                         System.out.print("Enter Account no. : ");  
	                         ac_no = sc.next();  
	                         found = false;  
	                         for (int i = 0; i < arrayOfObjects.length; i++) {  
	                             found = arrayOfObjects[i].search(ac_no);  
	                             if (found) {  
	                                 arrayOfObjects[i].deposit();  
	                                 break;  
	                             }  
	                         }  
	                         if (!found) {  
	                             System.out.println("Account doesn't exist..!!");  
	                         }  
	                         break;  
	                     case 4:  
	                         System.out.print("Enter Account No : ");  
	                         ac_no = sc.next();  
	                         found = false;  
	                         for (int i = 0; i < arrayOfObjects.length; i++) {  
	                             found = arrayOfObjects[i].search(ac_no);  
	                             if (found) {  
	                                 arrayOfObjects[i].withdrawal();  
	                                 break;  
	                             }  
	                         }  
	                         if (!found) {  
	                             System.out.println("Account doesn't exist..!!");  
	                         }  
	                         break;  
	                     case 5:  
	                         System.out.println("Bye Bye !!!! See you soon...");  
	                         break;  
	                 }  
	             } 
	             
	    }
	    }
	

