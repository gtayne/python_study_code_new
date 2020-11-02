package com.company.pojo9;

import java.io.*;

public class Test6 {
    public static void main(String[] args) {
        //向外写对象 需要对象转成字节流：对象所在的类要实现序列化
        File file = new File("C:\\Users\\gaoti\\Desktop\\test\\cat.txt");
        OutputStream os = null;
        ObjectOutputStream oos = null;
        try {
            os = new FileOutputStream(file);
            oos = new ObjectOutputStream(os);
            Cat cat = new Cat();
            cat.setAge(123);
            cat.setLength(10);
            cat.setName("abc");
            oos.writeObject(cat);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        /*反序列化 字节流-->对象*/
        InputStream is = null;
        ObjectInputStream  ois = null;
        try {
            is = new FileInputStream(file);
            ois = new ObjectInputStream(is);
            Cat cat = (Cat) ois.readObject();
            System.out.println(cat);  //Cat{name='abc', age=123, length=10}
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
