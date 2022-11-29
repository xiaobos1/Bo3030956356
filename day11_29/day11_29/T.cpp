#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <string.h>

void reverse(char* str, int head, int tail)
{
	char temp;
	while (head < tail)
	{
		temp = str[head];
		str[head] = str[tail];
		str[tail] = temp;
		tail--;
		head++;
	}
}
//int main()
//{
//	char arr[] = "hello world";
//	int len = strlen(arr);
//	reverse(arr, 0, len-1);
//	printf("%s", arr);
//
//
//	return 0;
//}
//
//int main()
//{
//	int a[3][3] = { 1,2,3,
//				    4,5,6,
//				    7,8,9 };
//	int sum = 0;
//	for (int i = 0, j = 0; i < 3; i++, j++)
//	{
//		sum += a[i][j];
//	}
//	printf("对角线的值：%d", sum);
//	return 0;
//}

//int main()
//{
//	int arr[12] = { 1,2,3,4,6,7,8,9 };
//	for (int i = 0; i < 12; i++)
//	{
//		printf("%-2d ", arr[i]);
//	}
//	return 0;
//}

//int main()
//{
//	int arr[10] = { 1,2,3,4,6,7,8,9 };
//	int k = 5;
//	int i, j;
//	if (k > arr[7])
//	{
//		arr[8] = k;
//	}
//	else
//	{
//		for (i = 0; i < 7; i++)
//		{
//			if (arr[i] < k)
//				continue;
//			else
//			{
//				for (j = 7; j >= i; j--)
//				{
//					arr[j + 1] = arr[j];
//				}
//				arr[j + 1] = k;
//				break;
//			}
//		}
//	}
//	for (int i = 0; i < 9; i++)
//		printf("%-2d", arr[i]);
//
//	return 0;
//}

//void reverse(int* str, int head, int tail)
//{
//	int temp;
//	while (head < tail)
//	{
//		temp = str[head];
//		str[head] = str[tail];
//		str[tail] = temp;
//		tail--;
//		head++;
//	}
//}
//int main()
//{
//	int arr[10] = { 1,2,3,4,5,6,7,8,9,0 };
//	reverse(arr, 0, 9);
//	for (int i = 0; i < 10; i++)
//		printf("%-2d", arr[i]);
//	return 0;
//}
//#include "c.h"
//extern int number;
//int main()
//{
//	int mon = 0;
//	for (int i = 0; i < 100; i++)
//	{
//		number -= 100;
//		printf("%d\n", number);
//		mon++;
//	}
//	printf("%d",mon );
//	return 0;
//}

#include <math.h>
//
//int main()
//{
//	int u = 987665;
//	double m = 1 / u;
//	double pi = pow(1 + m, u);
//	printf("%lf", pi);
//	return 0;
//}


//#define pi 3.14159
//#define s(p,r) p*r*r
//
//int main()
//{
//	printf("%lf", s(pi, 2));
//	return 0;
//}