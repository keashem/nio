package com.jd.bdp.test;

public class TestOut {
    public static void main(String[] args) throws InterruptedException {

        int i= 0;
        boolean flag = true;
        while(true){
            Thread.sleep(25);
            System.out.print("\t\t\t\t\t");
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            if(i<10 && flag){
                i++;
            } else if(i == 10 && flag){
                flag = false;
            } else if(!flag && i > 0){
                i--;
            } else if(i==0){
                flag = true;
            }
            System.out.println("甜妹又美又甜");
        }



    }
}
