package com.greatlearning.LabSession2.Question1;
import java.util.*;

public class MoneyTrasnaction {

	public static void main(String[] args) 
	{
		Scanner x=new Scanner(System.in);
		
		System.out.println("enter the size of transaction");
		int size=x.nextInt();
		
		int[] transactions=new int[size];
		System.out.println("enter the values of transaction");
		for (int i=0; i<size; i++)
		{
			transactions[i]=x.nextInt();
		}
		
		System.out.println("enter amount of targets that need to be achieved");
		int targets=x.nextInt();
		int sum;
		for (int i=0; i<targets; i++)
		{
//			int flag=0;
			sum=0;
			System.out.println("enter value of target");
			int target=x.nextInt();
			
			for(int j=0; j<transactions.length; j++)
			{
				sum+=transactions[j];
				if(sum>=target)
				{
					System.out.println("Tatget achieved at :"+(j+1)+" day");
	//				flag=1;
					break;
				}
			}
			if (sum<target)
				System.out.println("Target not achieved");
			
		}
		
		
	}

}
