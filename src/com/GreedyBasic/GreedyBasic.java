package com.GreedyBasic;

import java.util.Scanner;

/**
 * 
 * @author Asif
 * This program shows to pick up maximum of something
 * using greedy algorithm
 * You are given completion times for some tasks and the allocated 
 * time for you work
 * You have to write down a greedy algorithm to touch maximum of tasks
 *
 */
public class GreedyBasic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int[] tasks = new int[]{ 12,6,4,9,8,3,2,14,20};
	System.out.println("Maximum Allocated time frame for your Work: ");
	int thresholdvalue = sc.nextInt();
	int temp;
	int totalTime=0,numberofItem=0;
	//Sorting is done here
	for(int i=0;i<tasks.length;i++) {
		for(int j=0;j<tasks.length;j++) {
		temp=0;
			if(tasks[i]>tasks[j]) {
				//tasks[i]=tasks[i];
			}else {
				temp=tasks[i];
				tasks[i]=tasks[j];
				tasks[j]=temp;			
		}
		}
	}
	System.out.print("Sorted Array is: ");
	for(int i=0;i<tasks.length;i++) {
		System.out.print(tasks[i]+" ");
	}
	System.out.println();
	for(int i=0;i<tasks.length;i++) {
			totalTime=totalTime+tasks[i];
			if(totalTime<=thresholdvalue) {
			numberofItem=numberofItem+1;
			}else {
				break;
			}
		
	}
	System.out.println("Maximum number of Items: "+numberofItem);
	}

}
