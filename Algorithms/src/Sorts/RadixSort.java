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
public class RadixSort {
    
    //calculates the digit of the max number in the array.
    public int maxDigit(int [] numArray){
        int digit = 0;
        int max = 0;
        
        for(int i = 0; i < numArray.length; i++){
            if(numArray[i] > max)
                max = numArray[i];
        }
        
        while(max > 0){
            digit++;
            max /= 10;
        }
         
        return digit;
    }
    
//calculates the digit of the max number in the list.
    public int maxDigit(List<Integer> numList){
        
        int digit = 0;
        int max = 0;
        
        for(int i = 0; i < numList.size(); i++){
            if(numList.get(i) > max)
                max = numList.get(i);
        }
        
        while(max > 0){
            digit++;
            max /= 10;
        }
         
        return digit;
    }
    
    //sorts the array according to specific digit(exp parameter).
    public void stableSort(int [] numArray , int exp){
        
        int length = numArray.length;
        int [] temp = new int[length];
        int [] count = new int [10];
        for (int i = 0; i < 10; i++) {
            count[i] = 0;
        }
        
        //count array is set.
        for(int i = 0; i < length; i++){
            count[ (numArray[i] / exp ) % 10]++;
        }
        
        //real posiition is that digit is calculated.
        for(int i = 1; i < 10; i++)
            count[i] += count[i-1];
        
        for(int i = length - 1; i >= 0; i--){
            temp[count[ (numArray[i] / exp ) % 10] - 1] = numArray[i];
            count[ (numArray[i] / exp ) % 10]--;
        }
        
        for(int i = 0; i < length; i++)
            numArray[i] = temp[i];
    }
    
    //sorts the list according to specific digit(exp parameter).
    public void stableSort(List<Integer> numList , int exp){
        
        int length = numList.size();
        int [] temp = new int[length];
        int [] count = new int [10];
        for (int i = 0; i < 10; i++) {
            count[i] = 0;
        }
        
        //count array is set.
        for(int i = 0; i < length; i++){
            count[ (numList.get(i) / exp ) % 10]++;
        }
        
        //real posiition is that digit is calculated.
        for(int i = 1; i < 10; i++)
            count[i] += count[i-1];
        
        for(int i = length - 1; i >= 0; i--){
            temp[count[ (numList.get(i) / exp ) % 10] - 1] = numList.get(i);
            count[ (numList.get(i) / exp ) % 10]--;
        }
        
        for(int i = 0; i < length; i++)
            numList.set(i, temp[i]);
        
    }
    
    public void radixSort(int [] numArray){
        
        int digit = maxDigit(numArray);
        
        for(int i = 0; i < digit; i++){
            stableSort(numArray, (int)Math.pow(10, i));
        } 
    }
    
    public void radixSort(List<Integer> numList){
        int digit = maxDigit(numList);
        
        for(int i = 0; i < digit; i++){
            stableSort(numList, (int)Math.pow(10, i));
        } 
        
    }
    
}
