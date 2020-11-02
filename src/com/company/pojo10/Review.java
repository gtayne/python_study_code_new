package com.company.pojo10;

public class Review {
    public static void main(String[] args) {
//        int a = 10;
//        switch (a) {
//            case 1: {
//                System.out.println(a);
//                break;
//            }
//            case 2: {
//                System.out.println(a);
//                break;
//            }
//            default: {
//                System.out.println("not match");
//            }
//        }
//
//        Month m = Month.LEFT;  //枚举类型
//        switch (m) {
//            case RIGHT: {
//                System.out.println(-1);
//                break;
//            }
//        }
//
        int[] arr =  {11,99,4,0,33,7};
/*冒泡排序*/
//        for(int i=0;i<arr.length-1;i++){
//            for (int j=0;j<arr.length-1;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
        /*选择排序*/
//        for (int i=0;i<arr.length-1;i++){
//            int max=arr[i];
//            int index = i;
//            for (int j=i;j<arr.length;j++){
//                if(max<arr[j]){
//                    max=arr[j];
//                    index=j;
//                }
//            }
//            int temp = arr[i];
//            arr[i]=arr[index];
//            arr[index]=temp;
//        }
        /*插入排序*/
//        for (int i=1;i<arr.length;i++){
//            for (int j=i;j>0;j--){
//                if (arr[j]<arr[j-1]){
//                    int temp = arr[j];
//                    arr[j]=arr[j-1];
//                    arr[j-1]=temp;
//                }
//            }
//        }
//        for (int x:arr
//        ) {
//            System.out.println(x);
//        }
        int[] arrs={0,4,11,12,33,99};
        a(1,2,3,4,5,6,7,8,9,0);  //数组的地址
    }
    /*二分查找*/
    public static int search(int[] arrs,int num) {
        int start = 0;
        int end = arrs.length-1;
        int serach = num;
        while (start<=end){
            int middle = (start+end)/2;
            if (serach==arrs[middle]){
                System.out.println(middle);
                return arrs[middle];
            }if (serach>arrs[middle]){
                start = middle+1;
            }if (serach<arrs[middle]){
                end = middle-1;
            }
            }
        return -1;

    }
    public static void a(int... a){
        System.out.println(a);
        for (int x:a
             ) {
            System.out.println(x);
        }
    }
}
