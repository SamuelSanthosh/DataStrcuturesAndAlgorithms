/*Count no of elements which are equal to the XOR of next two elements 
IP: 5
    2 1 3 1 5 4
OP: 2
*/
#include <stdio.h>
int countElements(int arr[],int N){
    int count = 0;
    for(int i = 0;i < N-2;i++){
        if(arr[i] == (arr[i+1]^arr[i+2])){
            count++;
        }
    }
    return count;
}
int main(void) {
	// your code goes here
    int N;
    scanf("%d",&N);
    int a[N];
    for(int i = 0;i < N;i++){
        scanf("%d",&a[i]);
    }
    printf("%d",countElements(a,N));
	return 0;
}
