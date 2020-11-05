package com.jd.bdp.test;

public class IOTest {
    public static void main(String[] args) {
        String str = "安"; //中文是3个字节，英文是1个字节
        int byte_len =str.getBytes().length;
        System.out.println("字节长度：" + byte_len);

    }

}
