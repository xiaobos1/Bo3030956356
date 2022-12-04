#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <string.h>
void reverse(char* s, int head, int tail) {
    char ch;
    while (tail > head) {
        ch = s[head];
        s[head] = s[tail];
        s[tail] = ch;
        tail--;
        head++;
    }
}

char* reverseLeftWords(char* s, int n) {
    int len = strlen(s);
    reverse(s, 0, n - 1);
    reverse(s, n, len - 1);
    reverse(s, 0, len - 1);
    return s;
}

public String replaceSpace(String s) {
    int length = s.length();
    char[] array = new char[length * 3];
    int size = 0;
    for (int i = 0; i < length; i++) {
        char c = s.charAt(i);
        if (c == ' ') {
            array[size++] = '%';
            array[size++] = '2';
            array[size++] = '0';
        }
        else {
            array[size++] = c;
        }
    }
    String newStr = new String(array, 0, size);
    return newStr;
}