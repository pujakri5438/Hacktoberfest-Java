#include<stdio.h>
int main()
{
	int temp,n,r,sum=0;
	 
	printf("enter the numbers");
	scanf("%d",&n);
	temp=n;
	while(n>0){
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(temp==sum)
	printf("it is palindrome number");
	else
	printf("not a palindrome number");
	
}
