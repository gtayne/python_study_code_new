package com.company.pojo9;
import java.io.*;
public class Test5 {
    public static void main(String[] args) {
        //一个字节流 可以实现按行读
        //将字节流传唤为字符流
        File file = new File("C:\\Users\\gaoti\\Desktop\\test\\test.txt");
        File target = new File("C:\\Users\\gaoti\\Desktop\\test\\t\\test1.txt" );
        InputStream is = null; //字节流初始化
        OutputStream os =null;
        BufferedWriter bw = null;  //缓冲字节初始化
        BufferedReader br = null;
        try {
            is = new FileInputStream(file);
            os = new FileOutputStream(target);
            InputStreamReader isr = new InputStreamReader(is);  //将字节流转换为字符流
            OutputStreamWriter osw = new OutputStreamWriter(os);
            br=new BufferedReader(isr); //缓冲字符流
            bw=new BufferedWriter(osw);
            String str = br.readLine();
            while (str!=null){
                bw.write(str);  //缓冲字符流写入
                bw.newLine();
                str = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
                is.close();
                bw.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
