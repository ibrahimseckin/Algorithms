#include <iostream>
using namespace std;

struct Node{
	int data;
	Node* left;
	Node* right;
};
Node* globalRoot; //for iterative insert method


Node* CreateNode(int data){
	Node* node = new Node();
	node->data = data;
	node->left = NULL;
	node->right = NULL;
	return node;
}

//iterative insert method
void Insert(int data){

	Node* newNode = CreateNode(data);
	if(globalRoot == NULL){ // if tree is empty
		globalRoot = newNode;
	}
	else{
		Node* temp; //Node* for scanning the tree
		temp = globalRoot;
		while(temp != NULL){
			if(data <= temp->data){
				if(temp->left != NULL)
					temp = temp->left;
				else{
					temp->left = newNode;
					return;
				}
			}
			else{
				if(temp->right != NULL)
					temp = temp->right;
				else{
					temp->right = newNode;
					return;
				}
			}
				
		}
	}
}

//recursive Insert method
Node* RecInsert(Node* root,int data){
	if(root == NULL){ //if tree is empty
		root = CreateNode(data);
	}
	else{
		if(data <= root->data){
			root->left = RecInsert(root->left,data);
		}
		else{
			root->right = RecInsert(root->right,data);
		}
	}
	return root;
}

//DFS print
void Print(Node* root){
	Node* temp = root;
	if(temp != NULL){
		cout << temp->data << endl;
	}
		Print(temp->left);
		Print(temp->right);
}

int main(){
	Node* root;
    root = NULL;
	globalRoot = NULL;

     getchar();
return 0;
}