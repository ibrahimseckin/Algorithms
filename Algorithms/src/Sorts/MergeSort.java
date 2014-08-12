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
        
        public static int[] mergeSort(int[] numArray){
            if(numArray.length > 1){
                int firstHalf = (numArray.length + 1) / 2;
                //int secondHalf = numList.size() - firstHalf;
                
                int[] first = new int[firstHalf];
                for(int i = 0; i < firstHalf; i++)
                    first[i] = numArray[i];
                
                int[] second = new int[numArray.length - firstHalf];
                for(int i = firstHalf; i < numArray.length; i++){
                    second[i-firstHalf] = numArray[i];
                }
                
                first = mergeSort(first);
                second = mergeSort(second);
                
                int firstPtr = 0;
                int secondPtr = 0;
                int commonPtr = 0;
                
                while(firstPtr != first.length && secondPtr != second.length){
                    if(first[firstPtr] <= second[secondPtr]){
                        numArray[commonPtr] = first[firstPtr];
                        commonPtr++;
                        firstPtr++;
                    }
                    else{
                        numArray[commonPtr] = second[secondPtr];
                        commonPtr++;
                        secondPtr++;
                    }
                }
                
                while(firstPtr != first.length){
                        numArray[commonPtr] = first[firstPtr];
                        commonPtr++;
                        firstPtr++;
                }
                
                while(secondPtr != second.length){
                    numArray[commonPtr] = second[secondPtr];
                        commonPtr++;
                        secondPtr++;
                    }
                }
                
            return numArray;
            }
}
