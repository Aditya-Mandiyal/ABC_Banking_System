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
	        System.out.print("Type Number of Customers Who want to create Account -");  
	        int num = sc.nextInt();  
	        ArrayList<ABCbank> accountlist =new ArrayList<>(num); 
	        for (int i = 0; i < accountlist.size(); i++) {  
	            accountlist.set(i,new ABCbank());  
	            accountlist.get(i).openAccount();  
	        }  
	    }
	    }
	
