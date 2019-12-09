package com.BridgeLabz.basics;

import java.util.Scanner;

public class UserName_Replace {
	  public static void main(String[] args)
	   {
		   Scanner sc2=new Scanner(System.in);
		   String s="Hello <<UserName>>, How are you?";
		   System.out.println(s);
		   System.out.println("pls enter the user name!");
		   String s1=sc2.nextLine();
		   String temp="";
		   if(s1.length()>=3)
		   {
			   temp= s.replace("<<UserName>>",s1 );
			   System.out.println("The replaced string is "+temp);
		   }
		   else
		   {
			   System.out.println("pls enter more than 3 characters!!");
		   }
		  
	   }
}
