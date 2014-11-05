#include <iostream>

using namespace std;

struct Node{
	int data;
	Node* next;
};

Node* CreateNode(int data){
	Node* newNode = new Node();
	newNode->data = data;
	newNode->next = NULL;
}

void Push(int data){
	Node* node = CreateNode(data);
	node->next = head;
	head = node;
}

void Pop(){
	if(head == NULL){
		cout << "There is no element" << endl;
		return;
	}
	Node* temp = head;
	head = head->next;
	delete(temp);
}

bool IsEmpty(){
	return head == NULL;
}

Node* head;

int main(){
	head = NULL;

	return 0;
}