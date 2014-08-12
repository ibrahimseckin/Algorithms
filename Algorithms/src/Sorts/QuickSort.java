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
        
        if(end > start){
            int pivot = numList.get((start+end)/2);
            
            while(k > i){
                
                while(numList.get(i) <= pivot && i < k && i <= end)
                    i++; //index of the first number that is greater from pivot in left part
                while(numList.get(k) > pivot && k >= i && k >= start)
                    k--;
                if(k > i)
                    swap(numList,i,k);
            }
            swap(numList , start , k);
            
            quickSort(numList,start,k-1);
            quickSort(numList,k+1,end);
        }
        else{
            return;
        }
    }
    
    public void quickSort(int[] numArray , int start, int end){
        
        int i = start;
        int k = end;
        
        if(end > start){
            int pivot = numArray[(start+end)/2];
            
            while(k > i){
                
                while(numArray[i] <= pivot && i < k && i <= end)
                    i++; //index of the first number that is greater from pivot in left part
                while(numArray[k] > pivot && k >= i && k >= start)
                    k--;
                if(k > i)
                    swap(numArray,i,k);
            }
            swap(numArray , start , k);
            
            quickSort(numArray,start,k-1);
            quickSort(numArray,k+1,end);
        }
        else{
            return;
        }
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
