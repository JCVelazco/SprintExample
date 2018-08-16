#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int countChar(char word[]){
	int lower=0, upper=0;
	for (int i = 0; word[i] != '\0' ; ++i){
		if (word[i] > 64 && word[i] < 91){
			upper ++;
		}else lower ++;
	}
	if (upper > lower)
		return 1;
	else 
		return 2;
}

void printWord(int option, char word[]){
	switch(option){
		case 1: 
		for (int i = 0; word[i] != '\0'; ++i){
			if (word[i] > 96 && word[i] < 123){
				word[i] -= 32;
			}
		}
		printf("%s\n", word);
		break;

		case 2:
		for (int i = 0; word[i] != '\0'; ++i){
			if (word[i] > 64 && word[i] < 91){
				word[i] += 32;
			}
		}
		printf("%s\n", word);
		break;
	}
}

int main(){
	char word[100];
	int option = 0;
	scanf("%s", word);
	option = countChar(word);
	printWord(option, word);

}