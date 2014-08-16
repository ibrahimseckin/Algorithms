#include <vector>

template <class T>
void bubbleSort(vector<T>& myVector){

	int size = myVector.size();

	for(int i = 0; i < size; i++){
		for(int j = 0; j < size - 1; j++){
			if(myVector.at(j) > myVector.at(j+1))
				swap(myVector.at(j) , myVector.at(j+1));
		}
	}
}