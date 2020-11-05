package com.jd.bdp.test;

public class TestCastNullPointerException {
    public static void main(String[] args) {

        /**
         * 修改Kafka MirrorMaker时，有一个Long类型的值往传了，向下转型时报了空指针异常这个错。
         *
         * */
        Long i = null;
        pri(i);

    }


    public static void pri(long i){
        System.out.println(i);
    }

}
