// 14. Up to 1,000 primes (*)

int dividend = 2;
int divisor = 2;
int count = 0;
boolean prime = true;
while(count<=1000) {
	if (prime == true) {
		System.out.print(dividend + " ");
		count++;
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