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
public class BubbleSort {
    
    //bubble sort for list.
    public void bubbleSort(List<Integer> numList){
        Swap s = new Swap();
        for(int i = 0; i < numList.size(); i++){
            for(int j = 0; j < numList.size() - 1; j++){
                if(numList.get(j) > numList.get(j+1)) //if less indexed number is bigger than the number at right it swaps.
                    s.swap(numList, j, j+1);
            }
        }
    }
    
    //bubble sort for array.
    public void bubbleSort(int[] numArray){
        Swap s = new Swap();
        for(int i = 0; i < numArray.length; i++){
            for(int j = 0; j < numArray.length - 1; j++){
                if(numArray[j] > numArray[j+1])//if less indexed number is bigger than the number at right it swaps.
                    s.swap(numArray, j, j+1);
            }
        }
    }
    
}
