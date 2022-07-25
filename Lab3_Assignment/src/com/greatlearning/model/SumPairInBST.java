package com.greatlearning.model;

import java.util.Set;


public class SumPairInBST {
	
	Node NewNode(int data)
	{
		Node temp=new Node(data);

		return temp;
	}
	
	//inserting new node to bst
	public Node InsertNode(Node root, int key)
	{
		if(root==null)
			return NewNode(key);
		else if(key<root.data)
			root.left=InsertNode(root.left, key);
		else
			root.right=InsertNode(root.right, key);
		
		return root;
	}
	
	
	public boolean findPair(Node root,int target, Set<Integer> set)
	{
		if(root==null)
			return false;
		if(findPair(root.left, target, set))
			return true;
		if(set.contains(target-root.data))
		{
			System.out.println("Pair Found: ("+(target-root.data)+","+root.data+")");
			return true;
		}
		else
		{
			set.add(root.data);
		}
		
		return findPair(root.right, target, set);
	}
}
