#include <iostream>
#include <cmath>
using namespace std;

int main() {
	// your code goes here
	int N;
	cin>>N;
	int a[N];
	for(int i=0;i<N;i++)
	{
	    cin>> a[i];
	}
	
	if(N == 1)
	 cout<<a[0];
	 
	else if(N%2){
	    int index = (N-3);
	    index = floor(index/4);
	    index = 3+index;
	    cout<<a[index - 1]<<endl;
	} 
	else{
	    int index = (N-2);
	    index = floor(index/4);
	    index = 2+index;
	    cout<<a[index - 1]<<endl;
	}
	return 0;
}
