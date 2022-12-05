#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h> 
#include <stdlib.h>
#include <time.h>
#define ROW 3
#define COL 3

//函数声明

//初始化棋盘
void initarr(char arr[ROW][COL], int row, int col);
//打印棋盘的函数
void dayiarr(char arr[ROW][COL], int row, int col);
//玩家下棋
void palymore(char arr[ROW][COL], int row, int col);
//电脑下棋
void comput(char arr[ROW][COL],int row,int col);
//
char iswin(char arr[ROW][COL], int row, int col);
