package com.godigit.banking;

import java.util.ArrayList;
import java.util.Scanner;
class ABCbank{
	    private String accno;  
	    private String name;  
	    private String acc_type;  
	    private long balance;
	    
	    public void openAccount() {
	    	
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
	
