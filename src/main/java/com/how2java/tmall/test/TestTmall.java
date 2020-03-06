package com.how2java.tmall.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class TestTmall {


    public static void main(String args[]){
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        Connection c = null;
//        try {
//            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tmall_springboot?useUnicode=true&characterEncoding=utf8",
//                    "root", "admin");
//            Statement s = c.createStatement();
//            for (int i =1;i<=10;i++){
//                String sqlFormat = "insert into category values(null,'测试分类%d')";
//                String sql = String.format(sqlFormat,i);
//                s.execute(sql);
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        HashMap<Integer,String> m = new HashMap<>();
        m.put(1,"string");
    }
}
