package com.jd.bdp.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ProcessTxt {
    public static void main(String[] args)  {
    try {
        BufferedReader in = new BufferedReader(new FileReader("/Users/zhonghou3/code/IDEA/PracticeCode/src/com/jd/io/jdq_broke.txt"));
        String str = "";
        HashMap<String, LinkedList<String>> map = new HashMap<>();

        while ((str = in.readLine()) != null) {
            //System.out.println(str);

            String[] split = str.split("\t");
            if(!map.containsKey(split[1])){
                map.put(split[1],new LinkedList<String>());
            }
            map.get(split[1]).push(split[0]);
        }
        for (Map.Entry<String, LinkedList<String>> item : map.entrySet()) {
            for (String iitem : item.getValue()) {
                System.out.println(item.getKey() +"\t"+ iitem);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
