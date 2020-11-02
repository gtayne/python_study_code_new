package com.company.pojo10;

public class insertSort {
    public static void main(String[] args) {
        int[] arr =  {11,99,4,0,33,7};
        for(int i=1;i<arr.length;i++){
            for (int j = i; j>0 ; j--) {
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
            for (int a:arr
            ) {
                System.out.print(a+",");
            }
            System.out.println();
        }

    }
}
