#include <vector>
#include <math.h>

template <class T>
int maxDigit(vector<T> myVector){
	
	int digit = 0;
	int max = 0;
	for(int i = 0; i < myVector.size(); i++){
		if(myVector[i] > max)
			max = myVector[i];
	}

	while(max > 0){
		digit++;
		max /= 10;
	}

	return digit;
}

template <class T>
void stableSort(vector<T>& myVector , int exp){
	
	int length = myVector.size();
	vector<T> temp;
	for (int i = 0; i < length; i++)
	{
		temp.push_back(0);
	}

	vector<T> count;
	for (int i = 0; i < 10; i++)
	{
		count.push_back(0);
	}

	for (int i = 0; i < length; i++)
	{
		count[ (myVector[i] / exp ) % 10]++;
	}

	for (int i = 1; i < 10; i++)
	{
		count[i] += count[i-1];
	}

	for (int i = length - 1; i >= 0; i--)
	{
		temp[count[ (myVector[i] / exp ) % 10] - 1] = myVector[i];
		count[ (myVector[i] / exp ) % 10]--;
	}

	for (int i = 0; i < length; i++)
	{
		myVector[i] = temp[i];
	}
}

template <class T>
void radixSort(vector<T>& myVector){
	int digit = maxDigit(myVector);
        
        for(int i = 0; i < digit; i++){
            stableSort(myVector, pow(10, i));
        } 
}