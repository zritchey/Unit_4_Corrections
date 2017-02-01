package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        A a =new C();
        System.out.println(a);
        for (int[]nums:arrSorter.nums) {
            System.out.println(Arrays.toString(nums));
            arrSorter.sortMthd(nums);
            System.out.println(Arrays.toString(nums)+"\n");
        }
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the rgb triple: ");
        String s=sc.next();
        System.out.println(hexHandler.hexFind(s));
    }
}
