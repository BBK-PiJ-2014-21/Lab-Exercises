// 14. Up to 1,000 primes (*)

int divisor = 2;
int dividend = 2;
int count = 0;
boolean prime = true;
while(count<=1000) {
	if (prime == true) {
		System.out.print(divisor + " ");
		count++;
	}
	divisor++;
	dividend = 2;
	prime = true;
	while(divisor>dividend) {
		if (divisor%dividend == 0) {
			prime = false;
			break;
		} else {
			dividend++;
		}
	}
}