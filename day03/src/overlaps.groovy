
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
Rectangle R1 = new Rectangle();
R1.firstPoint = pointA;
R1.secondPoint = pointB;

Point pointC = new Point();
Point pointD = new Point();
while(true) {
	System.out.print("Please enter the x coordinate of the third point: ");
	String s = System.console().readLine();
	pointC.x = Double.parseDouble(s);
	System.out.print("Please enter the x coordinate of the fourth point: ");
	s = System.console().readLine();
	pointD.x = Double.parseDouble(s);
	if (pointC.x == pointD.x) {
		System.out.println("The two points cannot be on the same coordinate.")
	} else {
		break;
	}
}
while(true) {
	System.out.print("Please enter the y coordinate of the third point: ");
	s = System.console().readLine();
	pointC.y = Double.parseDouble(s);
	System.out.print("Please enter the y coordinate of the fourth point: ");
	s = System.console().readLine();
	pointD.y = Double.parseDouble(s);
	if (pointC.y == pointD.y) {
		System.out.println("The two points cannot be on the same coordinate.")
	} else {
		break;
	}
}
Rectangle R2 = new Rectangle();
R2.firstPoint = pointC;
R2.secondPoint = pointD;

Point pointE = new Point();
System.out.print("Please enter the x coordinate of the fifth point: ")
s = System.console().readLine();
pointE.x = Double.parseDouble(s);
System.out.print("Please enter the y coordinate of the fifth point: ")
s = System.console().readLine();
pointE.y = Double.parseDouble(s);

boolean insideR1 = true;
boolean insideR2 = true;

if (pointE.x < pointA.x && pointE.x < pointB.x) {
	insideR1 = false;
}	
if (pointE.y < pointA.y && pointE.y < pointB.y) {
	insideR1 = false;
}
if (pointE.x > pointA.x && pointE.x > pointB.x) {
	insideR1 = false;
}	
if (pointE.y > pointA.y && pointE.y > pointB.y) {
	insideR1 = false;
}

if (pointE.x < pointC.x && pointE.x < pointD.x) {
	insideR2 = false;
}	
if (pointE.y < pointC.y && pointE.y < pointD.y) {
	insideR2 = false;
}
if (pointE.x > pointC.x && pointE.x > pointD.x) {
	insideR2 = false;
}	
if (pointE.y > pointC.y && pointE.y > pointD.y) {
	insideR2 = false;
}

System.out.print("The third point is ");
if (!insideR1 && !insideR2) {
	System.out.print("outside both rectangles");
} else if (!insideR1 && insideR2 || insideR1 && !insideR2) {
	System.out.print("inside one of the rectangles only");
} else {
	System.out.print("inside both rectangles");
}