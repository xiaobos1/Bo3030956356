#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>


#define MAX
#define NUMMAX(s,y) s>y?s:y
//int main()
//{
//	printf("%d", NUMMAX(19, 9));
//	return 0;
//}

//int main()
//{
//	int a = 6;
//	int b = 10;
//	printf("%o\n", b);
//	printf("%o\n", a);
//	printf("%d\n", a&b);
//
//	return 0;
//}

//
//int main()
//{
//	int a = 5;
//	int b = ~a;
//	printf("%d", b);
//	return 0;
//}

//int main()
//{
//	int i, j;
//	int a[10][10] = { 0 };
//	for (i = 0; i < 10; i++)
//	{
//		for (j = 0; j <= i; j++)
//		{
//			if (i == j || j == 0)
//				a[i][j] = 1;
//		}
//	}
//
//
//	for (i = 2; i < 10; i++)
//	{
//		for (j = 1; j <= i; j++)
//		{
//			a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
//		}
//	}
//
//	for (i = 0; i < 10; i++)
//	{
//		for (j = 0; j <= i; j++)
//		{
//			printf("%-4d", a[i][j]);
//		}
//		printf("\n");
//	}
//	
//	return 0;
//}



//int main()
//{
//	int a = 3;
//	int b = 4;
//	printf("a= %d ;b= %d\n", a, b);
//	printf("½»»»ºó\n");
//
//	//mean.1
//	/*a = a + b;
//	b = a - b;
//	a = a - b;*/
//
//
//	////mean.2
//	//a = a ^ b;
//	//b = a ^ b;
//	//a = a ^ b;
//
//	//mean.3
//	int temp = a;
//	a = b;
//	b = temp;
//	printf("a= %d ;b= %d", a, b);
//
//
//	return 0;
//}

void swap(int &a, int &b)
{
	int temp = a;
	a = b;
	b = temp;
}
void swap1(int &a,int& b)
{
	int temp = a;
	a = b;
	b = temp;
}
void swap2(int* a, int* b)
{
	int temp = *a;
	*a = *b;
	*b = temp;
}
int main()
{
	int a = 3;
	int b = 4;
	printf("a= %d ;b= %d\n", a, b);
	swap2(&a, &b);
	printf("a= %d ;b= %d", a, b);

}