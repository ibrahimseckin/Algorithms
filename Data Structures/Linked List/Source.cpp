#include <iostream>

using namespace std;

struct Node{
	int data;
	Node* next;
};

Node* head;

Node* CreateNode(int data){
	Node* temp = new Node();
	temp->data = data;
	temp->next = NULL;
	
	return temp;
}

void InserttoBeginning(Node* node){
	
	Node* temp = new Node();
	if(head == NULL){ // if list is empty
		head = node;
	}
	else{
		temp = head;
		head = node;
		head->next = temp;
	}
}

void Insert(int data, int index){
	int counter = 1;
	Node* node = CreateNode(data);
	Node* temp = head;

	if(index == 1){//if index is 1
		node->next = head;
		head = node;
		return;
	}

	while(counter+1 < index && temp != NULL){//scanning to find position
		temp = temp->next;
		counter++;
	}
	if(temp == NULL){//if index is invalid
		cout << "Wrong index" << endl;
		return;
	}

	node->next = temp->next;
	temp->next = node;
}

void Delete(int index){
	Node* temp = head;
	Node* deleted;
	int counter = 1;
	if(index == 1){
		head = head->next;
		return;
	}
	else{
		while(temp != NULL && counter+1 < index){
			temp = temp->next;
			counter++;
		}
		if(temp == NULL && counter+1 != index){
			cout << "Wrong index." << endl;
			return;
		}
		else{
			deleted = temp->next;
			temp->next = temp->next->next;
			delete(deleted);
		}
	}
	
}

void ReverseIterative(){
	Node *temp,*prev,*next;
	prev = NULL;
	next = NULL;
	temp = head;
	while(temp != NULL){
		next = temp->next;
		temp->next = prev;
		prev = temp;
		temp = next;
	}
	head = prev;
}

void ReverseRecursive(Node* node){
	Node * prev;
	if(node->next == NULL){
		head = node;
		return;
	}
	ReverseRecursive(node->next);
	prev = node->next;
	prev->next = node;
	node->next = NULL;
}

void PrintList(){
	Node * temp = head;
	while(temp != NULL){
		cout << temp->data << "-->";
		temp = temp->next;
	}
}

void PrintRecursive(Node* node){

	if(node == NULL) return;
	cout << node->data << " ";
	PrintRecursive(node->next);
}

void PrintReverseRecursive(Node* node){

	if(node == NULL) return;
	PrintReverseRecursive(node->next);
	cout << node->data << " ";
}
int main(){
	head = NULL;
	Insert(2,1);
	Insert(3,2);
	Insert(4,1);
	Insert(5,2);
	//Delete(2);
	PrintList();
	cout << endl;
	ReverseIterative();
	PrintList();
	cout << endl;
	PrintRecursive(head);
	cout << endl;
	PrintReverseRecursive(head);

	getchar();
	return 0;
}