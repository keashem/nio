package com.jd.bdp.test;

public class TestBreakpoit {
    public static void main(String[] args) {

        long base = System.currentTimeMillis();

        for (int i = 0; i < 5; i++) {
            System.out.println(System.currentTimeMillis() - base);
        }

    }
}
