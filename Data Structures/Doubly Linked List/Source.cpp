#include <iostream>

using namespace std;

struct Node{
	int data;
	Node* next;
	Node* prev;
};
Node* head;

Node* CreateNode(int data){

	Node* node = new Node();
	node->data = data;
	node->next = NULL;
	node->prev = NULL;
	return node;

}

void InserttoBeginning(int data){

	Node* node = CreateNode(data);
	if(head == NULL){ // if list is empty
		head = node;
		return;
	}
	else{
		node->next = head;
		head->prev = node;
		head = node;
	}
}

void InserttoTail(int data){
	Node* node = CreateNode(data);
	if(head == NULL){//if list is empty
		head = node;
		return;
	}
	else{
		Node* temp = head;
		while(temp->next != NULL){//scan the list
			temp = temp->next;
		}
		temp->next = node;
		node->prev = temp;
	}
}

void Delete(int index){

	Node* temp = head;
	int counter = 1;
	if(index == 1){
		head = head->next;
		head->prev = NULL;
		delete(temp);
		return;
	}
	while(counter+1 < index && temp != NULL){
		temp = temp->next;
		counter++;
	}
	if(temp == NULL){
		cout << "Invalid index." << endl;
		return;
	}
	else{
		Node* deleted = temp->next;
		temp->next = temp->next->next;
		temp->next->prev = temp;
		delete(deleted);
	}
}

void PrintForward(){
	Node* temp = head;
	while(temp != NULL){
		cout << temp->data << " ";
		temp = temp->next;
	}
	cout << endl;
}

void PrintBackward(){
	Node* temp = head;
	while(temp->next != NULL){
		temp = temp->next;
	}

	while(temp != NULL){
		cout << temp->data << " ";
		temp = temp->prev;
	}
	cout << endl;
}
int main(){
	head = NULL;
	InserttoBeginning(3);
	InserttoBeginning(4);
	InserttoBeginning(5);
	InserttoBeginning(6);
	PrintForward();
	InserttoTail(7);
	InserttoTail(8);
	InserttoTail(9);
	InserttoTail(10);
	PrintForward();
	Delete(15);
	Delete(4);
	PrintForward();
	Delete(1);
	PrintForward();
	PrintBackward();
	getchar();


	return 0;
}