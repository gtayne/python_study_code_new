package com.company.pojo9;

import java.io.*;

public class Test3 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\gaoti\\Desktop\\test\\abb.txt");
        File target = new File("C:\\Users\\gaoti\\Desktop\\test\\t\\test1.txt" );
        InputStream is = null;
        OutputStream os =null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            is=new FileInputStream(file);
            os=new FileOutputStream(target);
            bis = new BufferedInputStream(is);  //放入缓冲区速度会变快
            bos = new BufferedOutputStream(os);
            byte[] bytes =  new byte[(int)file.length()];
            bis.read(bytes);
            bos.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bis.close();
                is.close();
                bos.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
