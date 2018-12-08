package com.bashko.homework3;

public class GameIsTheOpposite {
    private String s;

    public GameIsTheOpposite(String s) {
        this.s = s;
    }

    public String stringOpposite() {
        MyArrayStack<Character> stack = new MyArrayStack<Character>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        String sOpposite = "";
        while (stack.size() > 0) {
                sOpposite = sOpposite + stack.pop();
            }
        return sOpposite;
    }
}
