#include<stdio.h>
int main()
{
	int n;
	long f=1;
	printf("enter n value: ");
	scanf("%d",&n);
	while(n>=1)
	{
		f=f*n;
		n--;
	}
	printf("factorial=%d",f);
}
