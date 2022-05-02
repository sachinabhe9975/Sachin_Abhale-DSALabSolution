package com.greatLearning.Test;

import java.util.Stack;
import com.greatLearning.Balanced_Brackets.FindBalancedBrackets;

public class Driver {

	public static void main(String[] args) {

		String s ="{}[](){}";
		
		Stack<Character> stack = new Stack<Character>();

		int size = s.length();

		FindBalancedBrackets.FindBalancedBrackets(s, size);

	}
}
