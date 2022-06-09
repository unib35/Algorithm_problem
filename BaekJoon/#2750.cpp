#include <iostream>
#include <algorithm>

using namespace std;

void print(int n){
	cout << n << endl;
}

int main(){
	int N, n;
	cin >> N;
	int *num = new int[N];
	for(int i=0;i<N;i++){
		cin >> n;
		num[i] = n;
	}
	sort(num, num+N);
	for(int i=0;i<N;i++){
		cout << num[i] << endl;
	}
	
	
	
	
	
	return 0;
} 
