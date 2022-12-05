#define _CRT_SECURE_NO_WARNINGS 1

#include "game.h"
#include"game.c"
void menu()
{
	printf("*********************\n");
	printf("******   1.paly   ***\n");
	printf("******   0.exit   ***\n");
	printf("*********************\n");

}
void game()
{
	char arr[ROW][COL];
	//初始化棋盘-初始化空格
	initarr(arr, ROW, COL);
	//打印棋盘
	dayiarr(arr, ROW, COL);
	//玩家下棋
	char ta = 0;
	while (1)
	{
		//玩家下棋
		palymore(arr, ROW, COL);
		dayiarr(arr, ROW, COL);
		//判断玩家是否胜利
		ta = iswin(arr,ROW,COL);
		if (ta != 'C')
		{
			break;
		}
		//电脑下棋
		comput(arr, ROW, COL);
		dayiarr(arr, ROW, COL);
		//判断电脑胜利
		ta = iswin(arr, ROW, COL);
		if (ta != 'C')
		{
			break;
		}
	}
	if (ta == '*')
	{
		printf("玩家赢了\n");
	}
	else if (ta == '#')
	{
		printf("电脑赢了\n");
	}
	else
	{
		printf("平局\n");
	}
	dayiarr(arr, ROW, COL);

	
}
int main()
{
	int ch=0;
	srand((unsigned int)time(NULL));

	do 
	{
		menu();
		printf("请选择：>");
		scanf("%d", &ch);
		switch (ch)
		{
		case 1:
			printf("三子棋小游戏\n");
			game();
			break;
		case 0:
			printf("退出游戏\n");
			break;
		default:
			printf("选择错误，重新选择\n");
			break;
		}
	} while (ch);
	return 0;
}