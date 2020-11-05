package com.jd.bdp.test;

import java.util.ArrayList;
import java.util.List;

public class TestExtend {
    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();
        list.add("sss");

        String str = (String)list.get(3);


    }


    public void kk(){
        Test<? extends TestExtend> a = new Test<TestExtend>();
        //a.hhhhhh(new TestExtend());
        TestExtend test = a.jjjjjj();
//        TestExtend jj = a.iiiii(new TestExtend());

        //其实get和put可以看做是 jjj 和 kkk，也就是一个往里面穿参数，另一个是返回参数。
        Test<? super TestExtend> b = new Test<TestExtend>();
        Object kkp = b.jjjjjj();
        b.hhhhhh(new TestExtend());

        Test<String> tk = new Test<>();
//        tk.hhhhhh(1);
//        int sx = tk.jjjjjj();

        tk.hhhhhh("kkk");
    }
    class A<S>{
        public <T> T AAA(T k){
            T a;
            return k;

        }
    }

    class Test<K>{
        K v = null;

        void hhhhhh(K t){

        }

        K jjjjjj(){
            return v;
        }

//        K iiiii(K t){
//
//        }

    }



}
