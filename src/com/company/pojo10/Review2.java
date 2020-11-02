package com.company.pojo10;

public class Review2 {
    public static void test(int a){
        a--;
        System.out.println(a);
        if(a==0){
            return;
        }
        test(a);
    }
    public static void main(String[] args) {
        test(5);
    }
}
