#include <stdio.h>

int main(void) {
	char c;
	scanf("%c",&c);
	if((c>='a' && c<='z') || (c>='A' && c<='Z'))
	printf("alphapet");
	else
	printf("not a alphapet");
	return 0;
}
