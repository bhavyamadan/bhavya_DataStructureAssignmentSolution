package com.q2.main;

import com.q2.service.BSTtoRightSkewed;

public class Driver {
	
	public static class Node {
		public Node left;
	    public Node right;
	    public int data;
	    
	};
	
	//Create a new Node
	public static Node newNode(int nodeData)
	{
	    Node temp = new Node();
	 
	    temp.data = nodeData;
	    temp.left = null;
	    temp.right = null;
	 
	    return temp;
	}
	
	public static void main(String[] args) {
		BSTtoRightSkewed rst = new BSTtoRightSkewed();
		
		Node tree = newNode(50);
		tree.left = newNode(30);
		tree.right = newNode(60);
		tree.left.left = newNode(10);
		//tree.left.right = newNode(20);
		tree.right.left = newNode(55);
		//tree.right.left.left =newNode(53);
		
		int order = 0;
		Node headNode =rst.flattenBTToSkewed(tree, order);
		rst.traverseRightSkewed(headNode);

	}

}
