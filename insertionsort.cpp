#include<iostream>
#include<vector>
using namespace std;

void printVector(vector<int> a){
	for(int i=0;i<a.size();i++){
		cout<<a[i]<<" ";
	}
	cout<<endl;
}
int insertionsort(vector<int> a){
	for(int j=1;j<a.size();j++){
		int key = a[j];
		int i = j-1;
		while(i>=0 && a[i]>key){
			a[i+1] = a[i];
			i--;
		}
		a[i+1] = key;
	}
	printVector(a);	
}

int main(int argc, const char *argv[])
{
	vector<int> a;
	for(int i=10;i>0;i--){
		a.push_back(i);
	}
	cout<<"Before Sorting: "<<endl;
	printVector(a);
	cout<<"After sorting: "<<endl;
	insertionsort(a); 

   	return 0;
}
