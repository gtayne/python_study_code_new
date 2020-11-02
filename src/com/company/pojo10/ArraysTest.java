package com.company.pojo10;
import java.lang.reflect.Array;
import java.util.*;
public class ArraysTest {
    public static void main(String[] args) {
        int[] arr={0,4,11,33,99};
        System.out.println(Arrays.binarySearch(arr,11));  //返回key在数组中的下标
        Arrays.sort(arr,3,5);  //从3-6（结束不包含）范围排序
        String str = Arrays.toString(arr); //将数组转成字符串
        System.out.println(str);  //[0, 4, 11, 33, 99]
        int[] arrs = Arrays.copyOf(arr,10);  //将一个数组复制到另一个数组内
                                                        //实现数组的扩容

        Arrays.fill(arr,100);  //用指定值填充数组 100 100 100 100 100
        for (int a :arr
        ) {
            System.out.println(a);
        }
    }
}
