package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.BracketChecker;

public class BracketCheckerMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		BracketChecker obj=new BracketChecker();
		
		String str;
		
		System.out.println("Enter a String: ");
		str=sc.nextLine();
		obj.bracketBalanceChecker(str);
			
		sc.close();
	}

}
