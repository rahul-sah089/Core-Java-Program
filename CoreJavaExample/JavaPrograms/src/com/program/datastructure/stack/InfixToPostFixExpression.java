package com.program.datastructure.stack;

public class InfixToPostFixExpression {
	char stacks[] = new char[20];
	int top = -1;

	void push(char ch) {
		top++;
		stacks[top] = ch;
	}

	char pop() {
		char ch = stacks[top];
		top--;
		return ch;
	}

	boolean isEmpty() {
		return (top < 0);
	}

	int pre(char ch) {
		switch (ch) {
		case '-':
			return 1;
		case '+':
			return 1;
		case '*':
			return 2;
		case '/':
			return 2;
		}
		return 0;
	}

	boolean isOperator(char ch) {
		if (ch == '*' || ch == '/' || ch == '-' || ch == '+' || ch == '(') {
			return true;
		}
		return false;
	}

	boolean isOperand(char ch) {
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			return true;
		}
		return false;
	}

	void postFix(String str) {
		char output[] = new char[str.length()];
		char ch;
		int p = 0, i;

		for (i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch == '(') {
				push(ch);
			} else if (isOperand(ch)) {
				output[p++] = ch;
			} else if (isOperator(ch)) {
				if (isEmpty() || (pre(ch) > pre(stacks[top])) || (stacks[top] == '(')) {
					push(ch);
				} else if (pre(ch) <= pre(stacks[top])) {
					output[p++] = pop();
					push(ch);
				} else if (ch == '(') {
					while ((ch = pop()) != ')') {
						output[p++] = ch;
					}

				}
			}
		}
		while (top != 0) {
			output[p++] = pop();
		}

		for (int j = 0; i < str.length(); j++) {
			System.out.println(output[j]);
		}
	}
	
	

}
