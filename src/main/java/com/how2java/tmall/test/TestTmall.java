package com.how2java.tmall.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
interface I{
    public static final int d= 0;
}
class Father implements  I{
    static int d = 0;
}
interface I1 extends I{
    public static final int d = 1;
}


public class TestTmall extends Father implements I{


    static int d =0;

    public TestTmall(){

    }

    public static void main(String args[]) {

        System.out.println(d);

    }
    public int fun1(String a,int b){
        return 1;

    }

    public int  fun1(String c,int e,int d){
        return 11;
    }

}


