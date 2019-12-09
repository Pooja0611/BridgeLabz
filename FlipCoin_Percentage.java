package com.BridgeLabz.basics;

import java.util.Scanner;

public class FlipCoin_Percentage {

	
		public static void main(String[] args) {
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter the no of times the coin to be flipped??");
			int flips=sc1.nextInt();
			int heads=0;
			int tails=0;
			int count=0;
		    double percentageHeads,percentageTails;
			while(count<=flips)
			{
				if(Math.random()<=0.5)
				{
					heads++;
					System.out.println("heads count= "+heads);
				}
				else
				{
				tails++;
				System.out.println("tails count= "+tails);
				}
				count++;
			}
			 percentageHeads=(double)heads/tails*100;
			 percentageTails=(double)tails/flips*100;
			 
			 System.out.println("percentage number of heads "+percentageHeads);
			 System.out.println("percentage number of tails "+percentageTails);
		}
	

	}


