package com.company.pojo9;

import java.io.*;

public class TestNew {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\gaoti\\Desktop\\test\\abb.txt");
        InputStream is = null;
        try {
            is = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int result1 = is.read(bytes); // //ѭ����ʼֵ

                while (result1!=-1){ //ѭ������
                result1 =  is.read(bytes);
                System.out.println(new String(bytes));  //���³�ʼֵ
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
