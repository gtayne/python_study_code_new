package com.company.pojo9;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\gaoti\\Desktop\\test\\abb.txt");
        File target = new File("C:\\Users\\gaoti\\Desktop\\test\\t\\" + file.getName());
        InputStream is = null;
        OutputStream os = null;
        //System.out.println(result1);  //输出的为读的长度（字节数组中实际存放内容长度）,读不到-1
        try {
            is = new FileInputStream(file);
            os = new FileOutputStream(target,true);
            byte[] bytes = new byte[1024];
            int result = is.read(bytes);
            while (result!=-1){
                os.write(bytes,0,result);  //指定偏移量和长度
                result=is.read(bytes);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
