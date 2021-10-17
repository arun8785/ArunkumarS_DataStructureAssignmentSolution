package com.greatelearning.driver;

 public class ConvertBstTree
		{
		
		// Class of the node
		static class Node 
		{
			int data;
			Node left;
			Node right;
		}
		
		static Node newNode(int data) 
		{
				Node temp = new Node();
		
				temp.data = data;
				temp.left = null;
				temp.right = null;
		
				return temp;
		}
		public static Node node;
		static Node prevNode = null;
		static Node headNode = null;
		   
		static void flattenBTToSkewed(Node root)
		{
		        // If not root then BST is empty
		        if(root == null)
		        {
		            return;
		        }
		       
		        flattenBTToSkewed(root.left);
		        Node rightNode = root.right;

		        if(headNode == null)
		        {
		            headNode = root;
		            root.left = null;
		            prevNode = root;
		        }
		        else
		        {
		            prevNode.right = root;
		            root.left = null;
		            prevNode = root;
		        }	       
	            flattenBTToSkewed(rightNode);  
		 }
		   
		    // Function to traverse the right
		    // skewed tree using recursion
		    static void traverseRightSkewed(Node root)
		    {
		        if(root == null)
		        {
		            return;
		        }
		        System.out.print("--->" + root.data + " ");
		        traverseRightSkewed(root.right);       
		    }
		   
		    // Driver Code
		    public static void main (String[] args)
		    {
		    	Node root = newNode(50);
				root.left = newNode(30);
				root.right = newNode(60);
				root.left.left = newNode(10);
				root.right.left = newNode(55);

		        flattenBTToSkewed(root);
		        traverseRightSkewed(headNode);
		    }
	}