package com.nivtek.training.local;

public class DemoLocalVariable {

    public static void main(String[] args) {
        int x = 1;
        // A local scope where args and x are visible

        while (x <= 5) {
            String msg = "x is now ";
            msg += x;
            // A local scope where args, x, and msg are visible
            System.out.println(msg);
            x++;
        }
        // msg is no longer in scope, and has been flushed from memory
        // Uncomment the line below to see the error message
        // System.out.println("value of msg is " + msg);
    }

}
