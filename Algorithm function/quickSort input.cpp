#include <iostream>

using namespace std;

void swap(int list[], int first, int last);

void quickSort(int list[], int first, int last){
	int i, j, pivot;
	if(first < last){
		i = first;
		j = last + 1;
		pivot = list[first];
		do{
			while(list[++i] < pivot && i <= last);
			while(list[--j] > pivot && j >= first);
			if(i < j) swap(list, i, j);
		} while(i < j);
		swap(list, first, j);
		quickSort(list, first, j-1);
		quickSort(list, j+1, last);
	} else{
		return;
	}
}

void swap(int list[], int first, int last){
	int temp;
	temp = list[first];
	list[first] = list[last];
	list[last] = temp;
}


int main(){
	int size, num;
	cout << "정렬할 원소의 개수를 입력하세요 : ";
	cin >> size;
	
	int *list = new int[size];
	for(int i=0;i<size;i++){
		cout << "[" << i+1 << "] 원소입력 : "; 
		cin >> num;
		list[i] = num;
	}
	
	quickSort(list, 0, size-1);
	cout << endl;
	
	for(int i=0;i<size;i++){
		cout << list[i] << "  ";
	}
	cout << endl;
	return 0;
}
