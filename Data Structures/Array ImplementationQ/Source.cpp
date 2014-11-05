#include <iostream>

using namespace std;
#define SIZE 100
int queue[SIZE];
int top = -1; //index of top element
int last = -1; // index of last element

void Enqueue(int data){
	last++;
	if(last < SIZE){
		if(IsEmpty() == true){
			top=last=0;
			queue[top] = data;
		}
		else
			queue[last] = data;
	}
	else
		cout << "Overflow" << endl;
}

void Dequeue(){
	if(IsEmpty() == true)
		cout << "There is no element" << endl;
	if(top == last)
		top=last= -1;
	else
		top++;
}

bool IsEmpty(){
	if(top == -1 || last == -1)
		return true;
	else
		return false;
}

int Front(){
	if(last != -1)
		return queue[top];
	else
		return -1;
}
