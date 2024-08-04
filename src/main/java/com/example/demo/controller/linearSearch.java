package com.example.demo.controller;

import java.util.Arrays;

public class linearSearch {

    public int sorting(){
        int[] str = {1,1,5,4,3,1,5,2};
        int count = 0;
        for(int i = 0 ; i< str.length ; i++){
            if(str[i]==5){
                count++;
            }
        }
        return count;
    }

    public int[] hashing(){
        int[] str = {1,1,5,4,3,1,5,2};
        int[] store = new int[6];
        for(int i = 0 ; i<str.length ; i++){
        if(str[i]==1){
            store[1]++;
        }
        else if(str[i]==5){
            store[5]++;
        }
        }
        return store;
    }

    public static void main(String[] args) {
        linearSearch ls = new linearSearch();
        int output = ls.sorting();
        System.out.println(output);
        int[] output2=ls.hashing();
        System.out.println(Arrays.toString(output2));
    }

}
