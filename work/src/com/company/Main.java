package com.company;

import com.company.lesson1.stack.StackOfItem;
import com.company.lesson1.stack.StackOfStrings;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    private static void StackOfStrings(Scanner in, PrintStream out) {

        StackOfStrings stack = new StackOfStrings();
        while (in.hasNext()) {
            String s = in.next();
            if ((s.equals("-"))) {
                out.print(stack.pop() + " ");
            } else {
                stack.push(s);
            }
        }
    }

    public static void main(String[] args) {
        //to be or not to - be - - that - - - is
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;
        StackOfItem(in, out);
    }

    private static void StackOfItem(Scanner in, PrintStream out) {

        StackOfItem<Integer> stack = new StackOfItem();
        while (in.hasNext()) {
            String s = in.next();
            if ((s.equals("0"))) {
                out.print(stack.pop() + " ");
            } else {
                stack.push(Integer.parseInt(s));
            }
        }


    }
}