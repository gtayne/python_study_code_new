package com.company.pojo9;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //当文件内含中文字符时使用字符流传输
        File file = new File("C:\\Users\\gaoti\\Desktop\\test\\test.txt");
        File target = new File("C:\\Users\\gaoti\\Desktop\\test\\t\\test1.txt" );
        Reader reader = null;
        Writer writer = null;
        try {
            reader = new FileReader(file);  //字符流进行文件读取
            writer = new FileWriter(target,true); //写字符串，拼接
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            System.out.println(chars);
            writer.write(chars);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                reader.close();
                writer.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }


























        
    }
    }
