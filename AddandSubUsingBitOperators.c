#include <stdio.h>
int add(int X,int Y){
    while(Y != 0){
        int carry = X & Y;
        X = X ^ Y;
        Y = carry << 1;
    }
    return X;
}
int sub(int X,int Y){
    while(Y != 0){
        int borrow = (~X) & Y;
        X = X ^ Y;
        Y = borrow << 1;
    }
    return X;
}
int main(void) {
	// your code goes here
	int X,Y;
	scanf("%d %d",&X,&Y);
	printf("%d",add(X,Y));
	printf("%d",sub(X,Y));
	return 0;
}

