package com.greatLearning.Balanced_Brackets;

import java.util.Stack;

public class FindBalancedBrackets {

	static Stack<Character> stack = new Stack<Character>();

	public static void FindBalancedBrackets(String s, int size)

	{
		char ch;
		boolean status = false;

		for (int j = 0; j < size; j++) {
			 
			ch = s.charAt(j);

			if (ch == '(' || ch == '[' || ch == '{') {

				stack.push(ch);
				continue;
			}

			if (!stack.isEmpty()) {

				if (ch == '}') {
					if (stack.peek() == '{') {
						stack.pop();
						status = true;
					} else {
						status = false;

					}

				}

				else if (ch == ']') {
					if (stack.peek() == '[') {
						stack.pop();
						status = true;
					} else {
						status = false;

					}

				}

				else if (ch == ')') {
					if (stack.peek() == '(') {
						stack.pop();
						status = true;
					} else {
						status = false;
					}

				}

			} else {
				status = false;

			}
		}

		if (status == false) {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

		else if (status == true) {

			System.out.println("The entered String has Balanced Brackets");
		}

	}

}
