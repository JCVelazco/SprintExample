#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
bool checkLetters(char letter, int letters[]){
	if (letters[letter] == 1)
		return true;
	else return false;

}

int readUsername(char username[]){
	int letters[26], gob = 0;
	for (int i = 0; i < 26; ++i)
	{
		letters[i] = 0;
	}
	for (int i = 0; username[i] != '\0'; ++i){
		if (checkLetters(username[i], letters)){
			
		}else{
			letters[username[i]] = 1;
			gob ++;
		}
	}
	return gob;

}

int main(){
	char username[100];
	int bog = 0;
	scanf("%s", username);
	bog = readUsername(username);
	if (bog % 2 == 0)
		printf("CHAT WITH HER!\n");
	else printf("IGNORE HIM!\n");

}