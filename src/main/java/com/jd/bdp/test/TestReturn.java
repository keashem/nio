package com.jd.bdp.test;

public class TestReturn {
    public static void main(String[] args) {

        System.out.println(ret1(3));
        System.out.println(ret(-3));


    }

    public static int ret(int a){

        int i = 0;
        //kafka源码中有这种写法，我当时记着在刷OJ时碰到过一道题，就是方法如果有返回值，那么所有的条件分支都要有返回值，不然编译阶段会报错。
        //这里使用了 while(true) 这种写法，从而在while循环中任意位置写上一个return语句，而不用所有分支都保证有返回值。
        //其实使用while(true)这种结构还可以不写return而编译不会报错，但是不写循环里面不写return会陷入无限循环。
        while(true){
            if(a <0){
                if(true){

                    return 1;
                }

            }
        }
    }

    public static int ret1(int a){

        if(a <0){
            return 1;
        }
        return a;
    }
}
