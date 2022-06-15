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
	int list[10] = {3, 2, 5, 7, 1, 9, 4, 10, 6, 8};
	
	quickSort(list, 0, 9);
	for(int i=0;i<10;i++){
		cout << list[i] << ' ';
	}
	cout << endl;
	return 0;
}
