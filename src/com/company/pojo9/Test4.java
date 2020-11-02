package com.company.pojo9;

import java.io.*;

public class Test4 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\gaoti\\Desktop\\test\\test.txt");
        File target = new File("C:\\Users\\gaoti\\Desktop\\test\\t\\test1.txt" );
        Reader reader = null;
        Writer writer = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            reader = new FileReader(file);
            writer = new FileWriter(target,true);  //这里可以选择拼接

            br=new BufferedReader(reader);
            bw=new BufferedWriter(writer);

            String str = new String();
            while (str!=null) {
                bw.write(str);
                bw.newLine(); //换行
                str= br.readLine();  //一行一行读
            }
//            char[] chars = new char[(int)file.length()];
//            br.read(chars);
//            System.out.println(new String(chars));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
                reader.close();
                bw.close();             //文件流一定要关闭，否则不能写入
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
