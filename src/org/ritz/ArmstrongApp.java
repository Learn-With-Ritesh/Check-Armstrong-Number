package org.ritz;
import java.util.*;
class Armstrong{
	int no;
	Armstrong(int no){
		this.no=no;
	}
	boolean checkArmstrong()
	{
		int rem,sum=0,temp=no,i;
		for(i=0;temp!=0;temp/=10,i++) {}
		temp=no;
		while(temp!=0)
		{
			rem=temp%10;
			int p=1;
			for(int j=1;j<=i;j++)
			{
				p=p*rem;
			}
			sum=sum+p;
			temp/=10;
		}
		if(sum==no)
			return true;
		else
			return false;
	}
}
public class ArmstrongApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to Armstrong or Not: ");
		int no=sc.nextInt();
		Armstrong a1=new Armstrong(no);
		if(a1.checkArmstrong())
		{
			System.out.println("\n"+no+" is Armstrong Number.");
		}
		else
		{
			System.out.println("\n"+no+" is not Armstrong Number.");
		}
	}

}
