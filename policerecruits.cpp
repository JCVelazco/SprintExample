/* codigo por JC */
//Police Recruits

#include <iostream>
#include <stdio.h>
using namespace std;

int main() {

	int cases = 0, number=0;
	int crimesCount = 0, crime=0, police=0;

	scanf("%d", &cases);

	for(int i=0; i<cases; i++){

		scanf("%d", &crime);

		if(crime > 0){
			police+=crime;
		}else{
			if(police<1){
			crimesCount++;
		}else{
			police--;
		}
		}
	}

	printf("%d\n", crimesCount);


}

