/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Searchs;

import java.util.List;

/**
 *
 * @author Ibrahim Seckin
 */
public class BinarySearch {
    
    //Array should be in ascending order.
    //If number is not in array it returns -1.
    public int binarySearch(int [] numArray , int number){
        
        int low = 0;
        int high = numArray.length -1 ;
        int mid = 0;
        while(low <= high){
            mid = low + (high - low) / 2;
            if(number < numArray[mid])//if number is in first half search in there
                high = mid - 1;
            else if(number > numArray[mid])//if number is in second half search in there
                low = mid + 1;
            else
                return mid;
        }
            return -1; 
    }
    
    //List should be in ascending order.
    //If number is not in list it returns -1.
    public int binarySearch(List<Integer> numList , int number){
        
        int low = 0;
        int high = numList.size() - 1;
        int mid = 0;
        while(low <= high){
            mid = low + (high - low) / 2;
            if(number < numList.get(mid))//if number is in first half search in there
                high = mid - 1;
            else if(number > numList.get(mid))//if number is in second half search in there
                low = mid + 1;
            else
                return mid;
        }
            return -1; 
    }
    
}
