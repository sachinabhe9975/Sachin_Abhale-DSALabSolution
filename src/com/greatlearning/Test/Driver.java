package com.greatlearning.Test;


import com.greatlearning.BST.BST;
import com.greatlearning.BST.BST.Node;
import com.greatlearning.FindpairSum.*;


public class Driver{

	public static void main(String[] args) {

		Node root = null;

		FindPairSum f = new FindPairSum();

		root = BST.insert(root, 40);

		BST.insert(root, 20);
		BST.insert(root, 10);
		BST.insert(root, 30);
		BST.insert(root, 60);
		BST.insert(root, 50);
		BST.insert(root, 70);

		f.findSumPair(root, 80);

	}

}

