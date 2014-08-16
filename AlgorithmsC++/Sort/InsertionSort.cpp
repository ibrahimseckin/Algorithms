#include <vector>

template <class T>
void insertionSort(vector<T>& myVector){
	T key;
	int j;
	for (int i = 1; i < myVector.size(); i++)
	{
		key = myVector[i];
		j = i - 1;
		while (j >= 0 && myVector[j] > key)
		{
			myVector[j+1] = myVector[j];
			j--;
		}
		myVector[j+1] = key;
	}
}