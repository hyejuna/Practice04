package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] wonArr = new int[10];
		
		wonArr[0]=50000;
		wonArr[1]=10000;
		wonArr[2]=5000;
		wonArr[3]=1000;
		wonArr[4]=500;
		wonArr[5]=100;
		wonArr[6]=50;
		wonArr[7]=10;
		wonArr[8]=5;
		wonArr[9]=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액: ");
		int amount = sc.nextInt();
		
		for(int i=0; i<wonArr.length; i++) {
			int quotient = amount/wonArr[i];
			System.out.println(wonArr[i]+"원: "+quotient +"개");
			amount = amount - (quotient*wonArr[i]);
		}
		
		sc.close();

	}

}
