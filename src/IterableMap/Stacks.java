package IterableMap;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        Stack<Character> piring = new Stack<>();
        piring.push('A');
        piring.push('B');
        piring.push('C');
        piring.push('D');
        piring.push('E'); //udah dipop
        System.out.println(piring.pop()); //akan mengeluarkan value yg paling terakhir ditambah
        piring.push('F');
        piring.push('G'); //udah dipop
        System.out.println(piring.pop());
        System.out.println(piring.search('B'));
    }
}
