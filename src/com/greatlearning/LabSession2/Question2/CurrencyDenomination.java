package com.greatlearning.LabSession2.Question2;
import java.util.*;

public class CurrencyDenomination {

	static int noteCount;
	public static void main(String[] args)
	{
		Scanner x=new Scanner(System.in);
		
		System.out.println("Enter the number of denominations");
		int num=x.nextInt();
		
		System.out.println("Enter the denomination values");
		int[] values=new int[num];
		
		for (int i=0; i<num; i++)
		{
			values[i]=x.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay");
		int amt=x.nextInt();
		System.out.println("Your payment approach in order to give min no of notes will be");
		while(amt>0)
		{
			int pay=BestDenomination(amt, values, num);
			if(num==1 && amt/values[0]>0)
			{
				System.out.println(values[0]+" x "+amt/values[0]);
				noteCount+=amt/values[0];
				amt%=values[0];
				break;
			}
			if(pay==0)
			{
				break;
			}
			int n=amt/pay;
			noteCount+=n;
			amt-=n*pay;
			System.out.println(pay+" x "+n);
			if(num>=2)
			num--;
		}
		
		System.out.println("total number of notes is "+noteCount);
		System.out.println("balance amount is :"+amt);
	}
	
	public static int BestDenomination(int amt, int[] values, int num)
	{
		int calc;
		int temp;
		int minValue=0; 
		int index=0;
		for(int i=0; i<num-1; i++) 
		{
			calc=amt/values[index];  
			temp=amt/values[i+1];   
			if(calc<temp && calc>0 && temp>0) 
			{
			minValue=values[index];    
			}
			
			else if(temp<calc && temp>0 && calc>0)
			{
			index=i+1;
			minValue=values[index];
			}
			
			else
			{
				if(calc>0 && temp==0)
					minValue=values[index];
				
				if(temp>0 && calc==0)
				{
					index=i+1;
					minValue=values[index];
				}
			}
		
	  }
			
		int t=values[num-1];
		values[num-1]=values[index];
		values[index]=t;
		return minValue;
	}
 }
		
		



