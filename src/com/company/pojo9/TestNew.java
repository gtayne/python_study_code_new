package com.company.pojo9;

import java.io.*;

public class TestNew {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\gaoti\\Desktop\\test\\abb.txt");
        InputStream is = null;
        try {
            is = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int result1 = is.read(bytes); // //循环初始值

                while (result1!=-1){ //循环条件
                result1 =  is.read(bytes);
                System.out.println(new String(bytes));  //更新初始值
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
