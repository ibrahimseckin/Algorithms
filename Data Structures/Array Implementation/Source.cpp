#include <iostream>

using namespace std;
#define SIZE 100
int stack[SIZE];
int top = -1; //index of top element

void Pop(){
	if(top == -1){
		cout << "There is no element at stack" << endl;
		return;
	}
	else{
		top = top - 1;
	}
}

bool IsEmpty(){
	top == -1 ? true : false;
}

int Top(){
	if(top != -1)
		return stack[top];
}

void Push(int data){
	top++;
	if(top < SIZE){
		stack[top] = data;
	}
}
int main(){

	return 0;
}