#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>

//int main()
//{
//	int score = 10;
//	if (score >= 80)
//	{
//		if (score == 100)
//		{
//			printf("S");
//			return 4;
//		}
//		if (score >= 90)
//		{
//			printf("A\n");
//			return 1;
//		}
//		printf("B\n");
//	}
//	else
//	{
//		if (score < 60)
//		{
//			printf("D\n");
//			return 2;
//		}
//		printf("C");
//	}
//
//	return 0;
//}

//int main()
//{
//	int a = 6660;
//	int b = 200;
//	int max = a > b ? a : b;
//	int min = a < b ? a : b;
//
//	int r = max % min;
//	while (r)
//	{
//		max = min;
//		min = r;
//		r = max % min;
//	}
//	printf("最大公约数为: %d\n", min);
//
//	return 0;
//}


//int main()
//{
//	char c;
//	while ((scanf("%c", &c)) != '\n')
//	{
//		printf("%c", c);
//	}
//
//
//
//	/*c = getchar();
//	while (c != '\n')
//	{
//		printf("%c", c);
//		c = getchar();
//	}*/
//	return 0;
//}


//s=a+aa+aaa+aaaa+aaaaa....
//int main()
//{
//	int n = 5;
//	int a = 2;
//	int t = a;
//	int sum = 0;
//	for (int i = 0; i < n; i++)
//	{
//		printf("%d ", a);
//		sum += a;
//		a *= 10;
//		a += t;
//		
//	}
//	return 0;
//}

//int main()
//{
//	int m = 7;
//	int n;
//	int sum = 0;
//
//	for (n = 1; n < m; n++)
//	{
//		if (m % n == 0)
//		{
//			sum += n;
//		}
//		if (sum == m)
//		{
//			printf("是完数");
//			return 1;
//		}
//	}
//	printf("不是完数");
//	return 0;
//}


//int main()
//{
//	float m = 100;
//	int h = 0;
//	for (int i = 1; i <= 10; i++)
//	{
//		m /= 2;
//	}
//	printf("%f", m);
//	return 0;
//}

//int main()
//{
//	int n = 1;
//	int num = 1;
//	for (int i = 1; i < 10; i++)
//	{
//		num= (n + 1) * 2;
//		n =num;
//	}
//	printf("%d", n);
//	return 0;
//}


//int main()
//{
//	int m = 4;
//	int i, j;
//	for (i = 0; i < m; i++)
//	{
//		//打印空格
//		for (int n = 0; n < m - i - 1;n++)
//			printf(" ");
//		for (int j = 0; j < 2 * i + 1; j++)
//			printf("*");
//		printf("\n");
//	}
//	for (j = 0; j < m - 1; j++)
//	{
//		for (int n = 0; n < j + 1; n++)
//			printf(" ");
//		for (int b = 0; b < 2 * (m - j - 1) - 1;b++)
//			printf("*");
//		printf("\n");
//	}
//	return 0;
//}

//int main()
//{
//	double sum = 0;
//	int a = 2;
//	int b = 1;
//	int t;
//	for (int i = 0; i < 20; i++)
//	{
//		sum += a/b;
//		t = a;
//		a =a+b;
//		b = t;
//
//	}
//	printf("%.02lf", sum);
//	return 0;
//}

typedef unsigned int u_int;
//int main()
//{
//	u_int s = 10;
//	return 0;
//}

//static 静态
/*
 修饰全局变量
 修饰局部变量
 修饰函数
*/

//void test()
//{
//	static int a = 1;
//	a++;
//	printf("%d ", a);
//}
//
//
//int main()
//{
//	int i = 0;
//	while (i < 10)
//	{
//		test();
//		i++;
//	}
//	return 0;
//}

//extern int g_val;
//int main()
//{
//	printf("%d\n", g_val);
//	return 0;
//}

//extern int Add(int a, int b);
//
//int main()
//{
//	printf("%d",Add(2, 3));
//	return 0;
//}


////定义宏
//#define ADD(X,Y) X+Y
//
//int main()
//{
//	printf("%d", ADD(2,3)* ADD(2, 3));
//	return 0;
//}


#include <string.h>
//int main()
//{
//	char arr[] = "abc defg";
//	char* p = arr;
//	printf("%d\n", strlen(arr));
//	printf("%c",*(p+1));
//	return 0;
//}

//int main()
//{
//	int a = 10;
//	int* pa = &a;
//
//	a = 1000;
//
//	//*pa = 20;
//	printf("%d\n",*pa);
//	return 0;
//}
typedef struct MathScore Ms;
struct MathScore
{
	char name[20];
	int score[3];
};


int main()
{
	Ms s[3];
	for (int i = 0; i < 3; i++)
	{
		printf("输入名字：\n");
		scanf("%s", &s[i].name);
		printf("输入三门成绩\n");
		scanf("%d%d%d", &s[i].score[0], &s[i].score[2], &s[i].score[3]);
	}
	int sum = 0;
	for (int i = 0; i < 3; i++)
	{
		printf("%s\n", s[i].name);
		printf("%d%d%d\n", s[i].score[0], s[i].score[1], s[i].score[2]);
	
	}
	return 0;
}