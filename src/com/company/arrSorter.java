package com.company;

/**
 * Created by zachary on 1/31/2017.
 */
public class arrSorter {

    public arrSorter(){

    }
    public static final int[][]nums={{1,2,3,-1,-2,-3},{-3,-2,-1,1,2,3},{-3,-2,1,-1,2,3},{-3,2,-1,1,-2,-3},{3,2,1,-1,-2,-3}};
    public static void sortMthd(int [] arr){
        int i=0, j=arr.length-1;
        while(i<j){
            if (arr[i]<0)
                i++;
            else if (arr[j]>0)
                j--;
            else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
    }
}
