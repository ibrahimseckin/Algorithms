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
public class MergeSort {
        
        public static List<Integer> mergeSort(List<Integer> numList){
            if(numList.size() > 1){
                int firstHalf = (numList.size() + 1) / 2;
                //int secondHalf = numList.size() - firstHalf;
                
                List<Integer> first = new ArrayList<>();
                for(int i = 0; i < firstHalf; i++)
                    first.add(i, numList.get(i));
                
                List<Integer> second = new ArrayList<>();
                for(int i = firstHalf; i < numList.size(); i++){
                    second.add(i-firstHalf, numList.get(i));
                }
                
                first = mergeSort(first);
                second = mergeSort(second);
                
                int firstPtr = 0;
                int secondPtr = 0;
                int commonPtr = 0;
                
                while(firstPtr != first.size() && secondPtr != second.size()){
                    if(first.get(firstPtr) <= second.get(secondPtr)){
                        numList.set(commonPtr, first.get(firstPtr));
                        commonPtr++;
                        firstPtr++;
                    }
                    else{
                        numList.set(commonPtr, second.get(secondPtr));
                        commonPtr++;
                        secondPtr++;
                    }
                }
                
                while(firstPtr != first.size()){
                    numList.set(commonPtr, first.get(firstPtr));
                    commonPtr++;
                    firstPtr++;
                }
                
                while(secondPtr != second.size()){
                    numList.set(commonPtr, second.get(secondPtr));
                    commonPtr++;
                    secondPtr++;
                }
            }
            
            return numList;
        }
    
}
