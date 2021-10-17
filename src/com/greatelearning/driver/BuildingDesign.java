package com.greatelearning.driver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import com.greatelearning.model.OrderOfConstruction;

public class BuildingDesign {
	//Driver Class to get the number of floors and floor constructed on each day
	public static void main(String a[]) {
		Queue<Integer> floorSize = new LinkedList<Integer>();
 
		Scanner in = new Scanner(System.in);
		//Get the number of total floors
		System.out.println("Enter the total no of floors in the building");
		int totalFloors = in.nextInt();
		System.out.println();
		//Get the floor size constructed on each day
		for (int i=0; i<totalFloors;i++) {
			int j=i+1;
			System.out.println("Enter the floor size given on day " + j);
			floorSize.add(in.nextInt());
		}
		//Call orderBlcoks function to order the floors based on days
		OrderOfConstruction orderOfCons = new OrderOfConstruction();
		orderOfCons.orderBlocks(floorSize);
		//Close the Scanner
		in.close();
	}//End of Main
}//End of Class
