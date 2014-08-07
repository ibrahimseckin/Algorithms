/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sorts;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Ibrahim Seckin
 */
public class InsertionSort {
    
    public static void insertionSort(List<Integer> numList){
        int key;
        int j;
        for(int i = 1; i < numList.size(); i++){
            key = numList.get(i);
            j = i - 1;
            while(j >= 0 && numList.get(j) > key){
                    //swap
                    numList.set(j+1, numList.get(j));
                    j--;
            }
            numList.set(j+1, key);
        }
    }
    
    public static void main(String [] args){
            List<Integer> mylist = new ArrayList<Integer>();
            for(int i = 0; i < 10; i++)
               mylist.add(i);
            
            insertionSort(mylist);
            for(int i = 0; i < 10; i++)
                System.out.println(mylist.get(i));
    }
    
}

