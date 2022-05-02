package com.greatlearning.FindpairSum;
import java.util.LinkedList;
import java.util.jar.Attributes.Name;

import com.greatlearning.BST.BST.Node;

public class FindPairSum {

	static int tempValue1;
	static int tempValue2;
	static LinkedList<Integer> ll = new LinkedList<Integer>();

	public static void findSumPair(Node pointer, int sumValue) {
		
		ll.add(pointer.key);
		FindPairSum.inOrder(pointer);
		FindPairSum.find(ll, sumValue);
	}

	public static void inOrder(Node root) {
		if (root == null)
			return;
		else {
			inOrder(root.left);
			ll.add(root.key);
			inOrder(root.right);

		}
	}
	
	
	public static void find(LinkedList<Integer> lS, int sumValue) {
		int size = lS.size();
		int data1st;
		int data2nd;
		int totalSum;
		boolean status = false;

		for (int i = 0; i < size; i++) {

			for (int j = i + 1; j < size; j++) {
				data1st = lS.get(i);
				data2nd = lS.get(j);
				totalSum = data1st + data2nd;

				if (totalSum == sumValue) {
					System.out.println("Pair is :(" + data1st + "  " + data2nd + ")");
					status = true;
				}

			}

		}
		if (status == false) {
			System.out.println(" nodes are not found.");
		}
	}
}
