package com.jd.bdp.test;

import java.util.HashMap;

public class TestInnerClass {

    public static void main(String[] args) {

        Inner1 obj1 = new Inner1();

        //不能通过以下这种构造方式来构造非静态内部类。
        //TestInnerClass.Inner2 obj2 = new TestInnerClass.Inner2();

        Inner2 obj3 = new TestInnerClass().new Inner2();
        new HashMap<String, Inner2>();
        new HashMap<Inner1, Inner2>();
        new Inner1();

        new HashMap<Inner1,Inner2>();

    }

    public int a = 1;
    private int b = 2;
    protected int c = 3;
    int d = 4;

    private static long h = 4;

    public void testCreate(){
        new Inner2();
        this.new Inner2();

        new Inner1();
        //this.new Inner1();  静态类不能这样构造。
    }

    public Inner2 tt(){
        return new Inner2();
    }

    public Inner1 t1(){
        return new Inner1();


    }


    public static class Inner1{

        private int a;

        public void tts(){
            a = 5;
            h = 9;
        }
    }

    public class Inner2{
        public void ttk(){
            b = 6;
            h = 90;
        }
    }
}

class T1{

    public static void t1(){

        new TestInnerClass.Inner1();
        //new TestInnerClass.Inner2();

        TestInnerClass te = new TestInnerClass();
        te.new Inner2();

        TestInnerClass.Inner2 tt = te.tt();

        new HashMap<TestInnerClass.Inner1, TestInnerClass.Inner2>();


    }

    public void t2(){

    }
}
