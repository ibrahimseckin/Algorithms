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
public class InterpolationSearch {
    
    //interpolation search for array.
    //if searched number is not in array returns -1.
    public int interPolationSearch(int [] numArray , int number){
        
        int low = 0;
        int high = numArray.length - 1;
        int mid;
        
        while(numArray[low] <= number && numArray[high] >= number){
            mid = low + ((high - number) * (high - low) / (numArray[high] - numArray[low]));
            
            if(number > numArray[mid])
                low = mid + 1;
            else if(number < numArray[mid])
                high = mid - 1;
            else
                return mid;
        }
        
        //serached number can be the first number.
        if(numArray[low] == number)
            return low;
        else
            return -1;
    }
    
    //interpolation search for list.
    //if searched number is not in list returns -1.
    public int interPolationSearch(List<Integer> numList, int number){
        
        int low = 0;
        int high = numList.size() - 1;
        int mid;
        
        while(numList.get(low) <= number && numList.get(high) >= number){
            mid = low + ((high - number) * (high - low) / (numList.get(high) - numList.get(low)));
            
            if(number > numList.get(mid))
                low = mid + 1;
            else if(number < numList.get(mid))
                high = mid - 1;
            else
                return mid;
        }
        
        //serached number can be the first number.
        if(numList.get(low) == number)
            return low;
        else
            return -1;
    }
    
}
