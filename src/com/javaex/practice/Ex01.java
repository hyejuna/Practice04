package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		// 0~4 다섯개인데 i <= intArray.length에서 "=" 때문에 없는 5번 방 들어감.
		// 출력값은 22
		
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for(int i=0; i<intArray.length; i++) {
			result = result + intArray[i];
		}
		System.out.println(result);

	}

}
