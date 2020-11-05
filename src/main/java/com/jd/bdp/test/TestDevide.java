package com.jd.bdp.test;

import com.jd.kafka.TProducer;


// kafka源码中用到很多内部类，这种使用机制的应用场景是:
// 一个Java文件只能有一个public类，如果不带public修饰符，那么是默认权限的class，在其它包是访问不到的，像TProducer1一样。
// 所以为了节省一些类文件，又能让其它类访问到，使用内部类这种形式，同时如果是private内部类，也能让外部类更好地封装数据和逻辑，比如Fetcher和completedFetchN

//import com.jd.kafka.TProducer1;

public class TestDevide {
    public static void main(String[] args) {
        System.out.println(11_00_000_000/1_000_00000);
        new TProducer();
        //new TProducer1();
    }
    private class hh{

    }
}

//private class kk{
//
//}
