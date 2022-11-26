#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>

//int main()
//{
//	int sum=0;
//	int count = 0;
//	//百位
//	for (int i = 1; i <= 4; i++)
//	{
//		//十位
//		for (int j = 1; j <= 4; j++)
//		{
//			//个位
//			for (int k = 1; k <= 4; k++)
//			{
//				//保证每一位都不同
//				if (i != j && i != k && j != k)
//				{
//					sum = i * 100 + j * 10 + k;
//					printf("%d\n", sum);
//					//总个数
//					count++;
//				}
//			}
//		}
//	}
//	printf("%d", count);
//	return 0;
//}


//int main()
//{
//	int money = 0;
//	int bouns = 0;
//	scanf("%d",&money);
//	if (money <= 100000)
//		bouns = money * 0.1;
//	else if (money <= 200000)
//		bouns = 100000 * 0.1 + (money - 100000) * 0.75;
//	else if (money <= 400000)
//		bouns = 100000 * 0.1 + 100000 * 0.075+(money - 200000) * 0.05;
//	else if (money <= 600000)
//		bouns = 100000*0.175+200000*0.05 + (money - 400000) * 0.03;
//	else if (money <= 1000000)
//		bouns = 100000 * 0.175 + 200000 * 0.08 +(money - 600000) * 0.015;
//	else
//		bouns = 100000 * 0.175 + 200000 * 0.08 +400000*0.015+(money - 1000000) * 0.01;
//
//	printf("%d", bouns);
//	return 0;
//}

//int main()
//{
//	double prorit = 0;
//	double bouns = 0;
//	scanf("%lf", &prorit);
//	if (prorit <= 100000)
//	{
//		bouns = prorit * 0.1;
//	}
//
//	printf("%lf", bouns);
//	return 0;
//}

//int main() 
//{
//	double money = 0;
//	int bouns = 0;
//	scanf("%lf", &money);
//	if (money <= 100000)
//		bouns = money * 0.1;
//	else if (money <= 200000)
//		bouns = 100000 * 0.1 + (money - 100000) * 0.75;
//	else if (money <= 400000)
//		bouns = 100000 * 0.1 + 100000 * 0.075 + (money - 200000) * 0.05;
//	else if (money <= 600000)
//		bouns = 100000 * 0.175 + 200000 * 0.05 + (money - 400000) * 0.03;
//	else if (money <= 1000000)
//		bouns = 100000 * 0.175 + 200000 * 0.08 + (money - 600000) * 0.015;
//	else
//		bouns = 100000 * 0.175 + 200000 * 0.08 + 400000 * 0.015 + (money - 1000000) * 0.01;
//
//	printf("%d", bouns);
//	return 0;
//}

//int main()
//{
//	double money = 0;
//	int bouns = 0;
//	scanf("%lf", &money);
//	if (money <= 100000)
//		bouns = money * 0.1;
//	else if (money <= 200000)
//		bouns = 100000 * 0.1 + (money - 100000) * 0.075;
//	else if (money <= 400000)
//		bouns = 100000 * 0.1 + 100000 * 0.075 + (money - 200000) * 0.05;
//	else if (money <= 600000)
//		bouns = 100000 * 0.175 + 200000 * 0.05 + (money - 400000) * 0.03;
//	else if (money <= 1000000)
//		bouns = 100000 * 0.175 + 200000 * 0.08 + (money - 600000) * 0.015;
//	else
//		bouns = 100000 * 0.175 + 200000 * 0.08 + 400000 * 0.015 + (money - 1000000) * 0.01;
//	printf("%d", bouns);
//	return 0;
//}
#include<math.h>
//int main()
//{
//	int s = 0, i, j, z;
//	for (i = 0; i < 100000; i++)
//	{
//		 j = sqrt(i + 100);
//		 z = sqrt(i + 168);
//		if (j * j == i + 100) 
//		{
//			s++;
//		}
//		if (z * z == i + 100 + 168)
//		{
//			s++;
//		}
//		if (s == 2)
//		{
//			printf("%d", i);
//			break;
//		}
//	}
//	//	return 0;
//	return 0;
//}

//int main()
//{
//	int a = 10;
//	int b = 20;
//	int c = 2;
//	int sum = a + b + c;
//	printf("%d\n", (a > b ? a : b) > c ? (a > b ? a : b) : c);
//	printf("%d\n", sum - ((a > b ? a : b) > c ? (a > b ? a : b) : c) - ((a < b ? a : b) < c ? (a < b ? a : b) : c));
//	printf("%d", (a <b ? a : b) < c ? (a < b ? a : b) : c);
//	
//	return 0;
//}

int main()
{
	int m = 5;
	for (int i = 0; i < m; i++)
	{
		printf("*");
	}
	return 0;
}