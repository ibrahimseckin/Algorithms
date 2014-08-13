/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sorts;

import java.util.List;

/**
 *
 * @author Ibrahim Seckin
 */
public class QuickSort {
    
    public void quickSort(List<Integer> numList){
        quickSort(numList , 0 , numList.size() - 1);
    }
    
    public void quickSort(int[] numArray){
        quickSort(numArray , 0 , numArray.length - 1);
    }
    
    public void quickSort(List<Integer> numList , int start, int end){
        
        int i = start;
        int k = end;
        int pivot = numList.get((start+end)/2);
            
            while(i <= k){
                
                while(numList.get(i) < pivot)
                    i++; //index of the first number that is greater from pivot in left part
                while(numList.get(k) > pivot)
                    k--;
                if(i <= k){
                    swap(numList,i,k);
                    i++;
                    k--;
                }
            }
            //swap(numList , start , k);
            if(start < k)
                quickSort(numList,start,k);
            if(i < end)
                quickSort(numList,i,end);
        }

    
    public void quickSort(int[] numArray , int start, int end){
        
        int i = start;
        int k = end;
        int pivot = numArray[(start+end)/2];
            
            while(i <= k){
                
                while(numArray[i] < pivot)
                    i++; //index of the first number that is greater from pivot in left part
                while(numArray[k] > pivot)
                    k--;
                if(i <= k){
                    swap(numArray,i,k);
                    i++;
                    k--;
                }
            }
            if(start < k)
                quickSort(numArray,start,k);
            if(i < end)
                quickSort(numArray,i,end);
        }

    
    public void swap(List<Integer> numList , int first , int second){
        
        int temp = numList.get(first);
        numList.set(first, numList.get(second));
        numList.set(second, numList.get(first));
    }
    
    public void swap(int[] numArray , int first , int second){
        
        int temp = numArray[first];
        numArray[first] = numArray[second];
        numArray[second] = temp;
    }
}
