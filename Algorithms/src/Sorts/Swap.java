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
public class Swap {
    
    //swap operation for list.
    public void swap(List<Integer> numList , int first , int second){
        
        int temp = numList.get(first);
        numList.set(first, numList.get(second));
        numList.set(second, temp);
    }
    
    //swap operation for array.
    public void swap(int[] numArray , int first , int second){
        
        int temp = numArray[first];
        numArray[first] = numArray[second];
        numArray[second] = temp;
    }
}
