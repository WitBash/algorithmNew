package com.bashko.homework3;

public class Expression {
    private String expr;

    public Expression(String expr) {
        this.expr = expr;
    }

    public boolean checkBrackets() {
        //(a + 4) * {(b - 7) / [a - 5 * (a-2)]}
        MyArrayStack<Character> stack = new MyArrayStack<Character>();
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    System.out.println("Error in " + i + " position");
                    return false;
                }
                int top = stack.pop();
                if (ch == ')' && top != '(' || ch == '}' && top != '{'
                        || ch == ']' && top != '[') {
                    System.out.println("Error in " + i + " position");
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("Error: brackets doesn't match.");
            return false;
        }
        return true;
    }
}
