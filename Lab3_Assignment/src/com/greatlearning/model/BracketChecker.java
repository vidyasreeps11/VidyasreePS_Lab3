package com.greatlearning.model;

import java.util.Stack;

public class BracketChecker {

	Stack<Character> myStack=new Stack<Character>();
	
	 public void bracketBalanceChecker(String str) {

		 int length=str.length();
		 
		 boolean balance=true;
		 boolean closingBracketFound=false;
		 
		 if(str.isBlank() || str.isEmpty())
				System.out.println("Blank or Empty String Entered..!!");
		 else if(length%2!=0)
				System.out.println("String is not balanced");
		else
		{
			for(int i=0;i<length;i++)
			{
				closingBracketFound=false;
				if(str.charAt(i)=='[' ||
				   str.charAt(i)=='{' ||
				   str.charAt(i)=='(')
				{
					myStack.push((Character)str.charAt(i));
				}
				
				else
				{
					closingBracketFound=true;
					char bracket=myStack.pop();
					int compare;
					switch (str.charAt(i)) {
					case ']': {
								compare=Character.compare(bracket, '[');
								if(compare!=0) { balance=false;} break;
							  }
					case '}': {
								compare=Character.compare(bracket, '{');
								if(compare!=0) { balance=false;} break;
							  }
					case ')': {
								compare=Character.compare(bracket, '(');
								if(compare!=0) { balance=false; }break;
						      }
					
					default:
						throw new IllegalArgumentException("Unexpected value: " + str);
					}
				}
			}
			
			if(balance==true && closingBracketFound==true)
				System.out.println("String is balanced");
			else
				System.out.println("String is not balanced");
		}
			
		}
		
	}


