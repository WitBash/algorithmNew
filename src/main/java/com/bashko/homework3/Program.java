package com.bashko.homework3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) {

//        MyArrayStack<Integer> stack = new MyArrayStack<Integer>();
//        stack.push(5);
//        stack.push(7);
//        stack.push(8);
//        stack.push(15);
//        stack.push(9);
//        System.out.println(stack.peek());
//        stack.pop();
//        stack.pop();
//        System.out.println(stack.peek());
//        stack.pop();
//        System.out.println(stack);

//        Expression expr = new Expression("(a + 4) * {(b - 7) / [a - 5 * (a-2)]}");
//        System.out.println(expr.checkBrackets());

//        MyArrayQueue<Integer> q = new MyArrayQueue<Integer>();
//        q.enqueue(5);
//        q.enqueue(8);
//        q.enqueue(9);
//        q.enqueue(3);
//
//        System.out.println(q);
//        System.out.println(q.peekFront());
//        q.dequeue();
//        q.dequeue();
//        q.enqueue(18);
//        q.enqueue(25);
//        q.dequeue();
//        q.dequeue();
//        q.dequeue();
//        q.enqueue(50);
//        q.enqueue(70);
//        System.out.println(q.peekFront());
//        q.enqueue(30);
//
//        System.out.println(q);
//        System.out.println(q.peekFront());

//        PostfixExpression expr = new PostfixExpression("3 2 + 2 *");
//        System.out.println(expr.calcExpression());

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s = null;
//        try {
//            s = br.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        GameIsTheOpposite gameOp = new GameIsTheOpposite(s);
//        System.out.println(gameOp.stringOpposite());

        MyArrayDeque<Integer> deque = new MyArrayDeque<Integer>();
        deque.insertLeft(5);
        deque.insertRight(6);
        deque.insertRight(7);
        deque.insertRight(8);
        deque.insertLeft(4);

        System.out.println(deque);
        deque.removeLeft();
        deque.removeLeft();
        deque.removeRight();

        deque.insertLeft(3);
        System.out.println(deque);
    }
}
