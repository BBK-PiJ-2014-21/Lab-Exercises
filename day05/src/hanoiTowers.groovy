// 2.3 Hanoi towers

BigInteger hanoiTowers(int n) {
	if (n==0) {
		return n;
	} else {
		return 1 + 2*hanoiTowers(n-1);
	}
}

System.out.println(hanoiTowers(1));
System.out.println(hanoiTowers(2));
System.out.println(hanoiTowers(3));
System.out.println(hanoiTowers(4));
System.out.println(hanoiTowers(2000));