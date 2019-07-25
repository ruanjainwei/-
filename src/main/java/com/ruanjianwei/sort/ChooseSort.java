package com.ruanjianwei.sort;

/**
 * created by Savage
 * 2019/7/25 current system date
 */
public class ChooseSort {

    //提供两个数组
    private int[] array;
    private int lenth;
    //提供构造器
    public ChooseSort(int[] array) {
        this.array = array;
        this.lenth = array.length;
    }

    /**
     * 打印数组中的所有元素
     */
    public void display(){
        for (int i: array) {
            System.out.println("---->"+i);
        }
        System.out.println();
    }

    /**
     * 选择排序法
     */
    public static int[] ChooseSort(int[] arr){
        //外层循环i控制轮数,主场数的索引
        int max=0;  //记录每一轮中最大数据的索引
        for(int i=0;i<arr.length-1;i++){
            max=i;
            //与主场数比较的数的范围 m
            for(int m=i+1;m<=arr.length-1;m++){
                if(arr[max]>arr[m]){
                    max=m;
                }
            }
            //max 最大数的位置
            if(max!=i){
                int temp=arr[i];
                arr[i]=arr[max];
                arr[max]=temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        //定义数组
        int[] array = {12,34,232,56,34,56,8};
        ChooseSort sort = new ChooseSort(array);
        System.out.println("排序前的数据");
        sort.display();
        sort.ChooseSort(array);
        System.out.println("排序后的数据");
        sort.display();

    }



}
