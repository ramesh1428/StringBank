package com.javaproblem.twosum;

import java.util.*;

public class TwoSumProblem {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numberOfElement;
		int target;
		
		System.out.println("Enter the number of element you want to insert in array : ");
		numberOfElement = sc.nextInt();
		
		System.out.println("Enter the sum to find : ");
		target = sc.nextInt();
		
		int[] array = new int[numberOfElement];
		
		for(int i=0 ; i<numberOfElement;i++) {
			System.out.println("Enter Element at index " + i + " : ");
			array[i] = sc.nextInt();
		}
		
		
		for(int i=0; i<numberOfElement; i++) {
			for(int j = i+1 ; j<numberOfElement;j++) {
				if( (array[i] + array[j]) == target ) {
					System.out.println("\n( " + array[i] + " , " + array[j] + " ) ");
				}
			}
		}
		sc.close();
	}
}
