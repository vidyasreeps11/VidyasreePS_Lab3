package com.greatlearning.main;

import java.util.HashSet;
import java.util.Set;

import com.greatlearning.model.Node;
import com.greatlearning.model.SumPairInBST;

public class SumPairInBSTMain {

	public static void main(String[] args) {
		
		SumPairInBST obj=new SumPairInBST();
		Node root=null;
		
		int []BST= {40,20,60,10,30,50,70};
		
		for(int key: BST)
		{
			root=obj.InsertNode(root,key);
		}

		int target=130;
		
		Set<Integer> set=new HashSet<>();
		if (!obj.findPair(root, target, set)) {
            System.out.println("Pair does not exist");
        }
	}

}
