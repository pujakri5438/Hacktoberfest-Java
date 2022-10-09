#include<stdio.h>
int main()
{
	int n;
	printf("enter days of no between 1-7");
	scanf("%d",&n);
	switch(n)
	{
		
    	case1: printf("sunday"); break;
	    case2: printf("monday"); break;
	    case3: printf("tuesday"); break;
	    case4: printf("wednesday"); break;
     	case5: printf("thrusday"); break;
     	case6: printf("friday"); break;
	    case7: printf("saturday"); break;
	default:
    printf("invalid day");
    
	
   }
   return 0;
}
