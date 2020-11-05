package com.jd.bdp.test;

public class TestException extends RuntimeException{

    public static void main(String[] args) {
        TestException t1 = new TestException();
        //t1.gege();

        try{
            t1.gege();
        } catch (RuntimeException e){
            System.out.println("hello world");
        }
    }


    public void thr(){
        //throws new MyException();
        //throw new MyException();

        try{
            throw new MyException();
        } catch (Exception e){

        }
    }

    public void gege(){
        //throw new RuntimeException();
        throw new TestException();
    }



class TeException extends RuntimeException{

}

}

class MyException extends Exception{

}
