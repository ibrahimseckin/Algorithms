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
public class HeapSort {
    
    private static int length;
    Swap s = new Swap();
    
    public void maxHeapify(int [] numArray, int i){
        int left = (2 * i);
        int right = (2 * i) + 1 ;
        int largestIndex = 0;
        
        
        if(left <= length && numArray[left] > numArray[i] )
            largestIndex = left;
        else
            largestIndex = i;
        
        if(right <= length && numArray[right] > numArray[largestIndex])
            largestIndex = right;
        
        if(largestIndex != i){
            s.swap(numArray, i, largestIndex);
            maxHeapify(numArray, largestIndex);
        }
            
    }
    
    public void buildMaxHeap(int [] numArray){
        length = numArray.length - 1;
        for(int i = length / 2; i >=0 ; i--){
            maxHeapify(numArray,i);
        }
    }
    
    public void heapSort(int [] numArray){
        
        buildMaxHeap(numArray);
        for(int i = length ; i >= 1; i--){
            s.swap(numArray,i,0);
            length--;
            maxHeapify(numArray, 0);
        }
    }
    
    public void maxHeapify(List<Integer> numList , int i){
        
        int left = (2 * i);
        int right = (2 * i) + 1 ;
        int largestIndex = 0;
        
        
        if(left <= length && numList.get(left) > numList.get(i) )
            largestIndex = left;
        else
            largestIndex = i;
        
        if(right <= length && numList.get(right) > numList.get(largestIndex))
            largestIndex = right;
        
        if(largestIndex != i){
            s.swap(numList, i, largestIndex);
            maxHeapify(numList, largestIndex);
        }
    }
    
    public void buildMaxHeap(List<Integer> numList){
        
        length = numList.size() - 1;
        for(int i = length / 2; i >=0 ; i--){
            maxHeapify(numList,i);
    }
    }
    
    public void heapSort (List<Integer> numList){
        
        buildMaxHeap(numList);
        for(int i = length ; i >= 1; i--){
            s.swap(numList,i,0);
            length--;
            maxHeapify(numList, 0);
        }
    }
    
}
