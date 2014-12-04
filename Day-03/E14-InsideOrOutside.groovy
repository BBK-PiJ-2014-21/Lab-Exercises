// 14. Inside or outside

class Rectangle {
	Point firstPoint;
	Point secondPoint;	
}

class Point {
	double x;
	double y;
}

boolean inside = true;
Point pointA = new Point();
Point pointB = new Point();
while(true) {
	System.out.print("Please enter the x coordinate of the first point: ");
	String s = System.console().readLine();
	pointA.x = Double.parseDouble(s);
	System.out.print("Please enter the x coordinate of the second point: ");
	s = System.console().readLine();
	pointB.x = Double.parseDouble(s);
	if (pointA.x == pointB.x) {
		System.out.println("The two points cannot be on the same coordinate.")
	} else {
		break;
	}
}
while(true) {
	System.out.print("Please enter the y coordinate of the first point: ");
	s = System.console().readLine();
	pointA.y = Double.parseDouble(s);
	System.out.print("Please enter the y coordinate of the second point: ");
	s = System.console().readLine();
	pointB.y = Double.parseDouble(s);
	if (pointA.y == pointB.y) {
		System.out.println("The two points cannot be on the same coordinate.")
	} else {
		break;
	}
}
Rectangle R = new Rectangle();
R.firstPoint = pointA;
R.secondPoint = pointB;

Point pointC = new Point();
System.out.print("Please enter the x coordinate of the third point: ")
s = System.console().readLine();
pointC.x = Double.parseDouble(s);
System.out.print("Please enter the y coordinate of the third point: ")
s = System.console().readLine();
pointC.y = Double.parseDouble(s);

if (pointC.x < pointA.x && pointC.x < pointB.x) {
	inside = false;
}	
if (pointC.y < pointA.y && pointC.y < pointB.y) {
	inside = false;
}
if (pointC.x > pointA.x && pointC.x > pointB.x) {
	inside = false;
}	
if (pointC.y > pointA.y && pointC.y > pointB.y) {
	inside = false;
}

System.out.print("The third point is ");
if (!inside) {
	System.out.print("not ");
} 
System.out.println("inside the rectangle")
if ((Math.abs(pointA.x-pointB.x)) == (Math.abs(pointA.y-pointB.y))) {
	System.out.println("(which by the way is a square)");
}