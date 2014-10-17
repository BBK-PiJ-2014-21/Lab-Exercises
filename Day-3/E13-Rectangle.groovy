// 13. Rectangle

// NOT COMPLETED

class Rectangle {
	Point upLeft;
	Point downRight;
}

class Point {
	double x;
	double y;
}

double side = 0.0;
double base = 0.0;

Point A = new Point();
System.out.print("Please enter the x coordinate of the point A: ");
String s = System.console().readLine();
A.x = Double.parseDouble(s);
System.out.print("Please enter the y coordinate of the point A: ");
s = System.console().readLine();
A.y = Double.parseDouble(s);

Point B = new Point();
System.out.print("Please enter the x coordinate of the point B: ");
s = System.console().readLine();
B.x = Double.parseDouble(s);
System.out.print("Please enter the y coordinate of the point B: ");
s = System.console().readLine();
B.y = Double.parseDouble(s);


Rectangle R = new Rectangle();
if (A.y < B.y) {
	R.downRight = A;
	R.upLeft = B;
} else if (A.y == B.y || A.x == B.x){
	System.out.println("These points are not on the opposite corners.");
	System.exit(0);
} else {
	R.downRight = B;
	R.upLeft=A;
}


(R.downRight.x-R.upLeft.x);
if () {
	side = (A.y-B.y);
} else {
	side = (B.y-A.y);
}

System.out.println("The perimeter of the rectangle is " + (side*2 + base*2));
System.out.println("The area is " + base*side);