package com.greatelearning.model;

import java.util.Queue;
import java.util.Stack;

public class OrderOfConstruction {
	
	public void orderBlocks(Queue<Integer> floorSize)
	{
		//Function is built to use Queue and Stack to print the order of floor on day wise
		int floorCount = 0;
		floorCount = floorSize.size();
		int s = floorSize.size();
		int currentTopFloor = 0;
		boolean stopPrint;
		Stack<Integer> stack = new Stack<>();
		for(int i = 1; i <= s; i++)
		{
			if(floorSize.peek() == floorCount)  //Condition will check highest floor constructed on each day
			{
				stopPrint = false;
				stack.add(floorSize.peek());
				currentTopFloor = floorSize.peek();
				floorSize.remove();
				System.out.println("Day" + i);
				//Print the floor values in reverse order of queue using POP from the stack
				while (!stack.isEmpty() && !stopPrint) {
					currentTopFloor = stack.peek();
					System.out.print(stack.pop()+" ");
					if (!stack.isEmpty()) {
						if(stack.peek() == currentTopFloor - 1) {
							stopPrint = false;
						} else {
							stopPrint = true;
						}
					}	
		        }
				floorCount = currentTopFloor - 1;
				currentTopFloor = 0;
				System.out.println();
			} else { //if the constructed floor is less the current floor map then move to stack
				stack.add(floorSize.peek());
				currentTopFloor = floorSize.peek();
				floorSize.remove();
				System.out.println("Day" + i);		
			}
		}
	}
}
