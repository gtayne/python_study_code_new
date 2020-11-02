package com.company.pojo10;

public class Test_new {
    public static void main(String[] args) {
        int[] arr={11,99,4,0,33,7};
        for (int i=0;i<arr.length-1;i++){
            int max=arr[i];
            int index = i;
            for (int j=i;j<arr.length;j++){
                if(max<arr[j]){
                    max=arr[j];
                    index=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        for (int x :arr
             ) {
            System.out.println(x);
        }
    }

}
