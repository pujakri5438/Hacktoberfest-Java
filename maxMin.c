#include<stdio.h>
int main()
{
	int max=-9,min=9,r;
	long n;
	printf("enter the number:");
	scanf("%d",&n);
	do
	{
	r=n%10;
	if(max<r)max=r;
	if(min>r)min=r;
	n=n/10;
	}
	while(n!=0);
	printf("max=%d \t min=%d",max , min);
}
