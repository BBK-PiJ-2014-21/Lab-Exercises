// 13. All the primes up to 1,000 (*)

int divisor = 2;
int dividend = 2;
int count = 0;
boolean prime = true;
while(count<=1000) {
	count++;
	if (prime == true) {
		System.out.print(divisor + " ");
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