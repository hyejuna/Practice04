package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			if(i==0) {
				continue;
			}
			while(true) {
				int check = 0;
				
				for(int j=0; j<i; j++) {
					if(lotto[i]==lotto[j]) {
						check=check+1;
					}
				}
				
				if(check==0) {
					break;
				}
				lotto[i] = (int)(Math.random()*45)+1;
				
			}
			
		}
		
			
			
			
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+"  ");
		}

	}

}
