// 13. All the primes up to 1,000 (*)

int dividend = 2;
int divisor = 2;
int count = 0;
boolean prime = true;
while(count<=1000) {
	count++;
	if (prime == true) {
		System.out.print(dividend + " ");
	}
	dividend++;
	divisor = 2;
	prime = true;
	while(dividend>divisor) {
		if (dividend%divisor == 0) {
			prime = false;
			break;
		} else {
			divisor++;
		}
	}
}