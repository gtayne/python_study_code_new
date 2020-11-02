package com.company.pojo9;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\gaoti\\Desktop\\test\\abb.txt");
        File target = new File("C:\\Users\\gaoti\\Desktop\\test\\t\\" + file.getName());
        InputStream is = null;
        OutputStream os = null;
        //System.out.println(result1);  //�����Ϊ���ĳ��ȣ��ֽ�������ʵ�ʴ�����ݳ��ȣ�,������-1
        try {
            is = new FileInputStream(file);
            os = new FileOutputStream(target,true);
            byte[] bytes = new byte[1024];
            int result = is.read(bytes);
            while (result!=-1){
                os.write(bytes,0,result);  //ָ��ƫ�����ͳ���
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
