/* 12. Distance point-to-point
	this version calculates the distance between each couple of points,
	and returns the two points which are closer the each other;
*/

class Point {
	double x;
	double y;
}

Point point1 = new Point();
System.out.print("Please enter the X coordinate of the first point: ");
String s = System.console().readLine();
point1.x = Double.parseDouble(s);
System.out.print("Please enter the Y coordinate of the first point: ");
s = System.console().readLine();
point1.y = Double.parseDouble(s);
Point point2 = new Point();
System.out.print("Please enter the X coordinate of the second point: ");
s = System.console().readLine();
point2.x = Double.parseDouble(s);
System.out.print("Please enter the Y coordinate of the second point: ");
s = System.console().readLine();
point2.y = Double.parseDouble(s);
Point point3 = new Point();
System.out.print("Please enter the X coordinate of the third point: ");
s = System.console().readLine();
point3.x = Double.parseDouble(s);
System.out.print("Please enter the Y coordinate of the third point: ");
s = System.console().readLine();
point3.y = Double.parseDouble(s);

System.out.print("The distance between the first point and the second point is ");
double distanceOneTwo = (Math.sqrt(Math.pow((point1.x-point2.x),2) + Math.pow((point1.y-point2.y),2)));
System.out.println(distanceOneTwo);

System.out.print("The distance between the first point and the third point is ");
double distanceOneThree = (Math.sqrt(Math.pow((point1.x-point3.x),2) + Math.pow((point1.y-point3.y),2)));
System.out.println(distanceOneThree);

System.out.print("The distance between the second point and the third point is ");
double distanceTwoThree = (Math.sqrt(Math.pow((point2.x-point3.x),2) + Math.pow((point2.y-point3.y),2)));
System.out.println(distanceTwoThree);

double point2Sum = point2.x+point2.y;
double point3Sum = point3.x+point2.y;

if (distanceOneTwo < distanceOneThree) {
	if (distanceOneTwo < distanceTwoThree) {
		System.out.println("The distance first-second point is the closest.");
	} else if (distanceTwoThree < distanceOneTwo) {
		System.out.println("The distance second-third point is the closest.");
	} else if (distanceOneTwo == distanceTwoThree) {
		System.out.println("The distance first-second point and second-third point are equally the closest.")
	}
} else if (distanceOneThree < distanceOneTwo) {
	if (distanceOneThree < distanceTwoThree) {
		System.out.println("The distance first-third point is the closest.") 
	} else if (distanceTwoThree < distanceOneThree) {
		System.out.println("The distance second-third point is the closest.")
	} else if (distanceOneThree == distanceTwoThree) {
		System.out.println("The distance first-third point and second-third point are equally the closest.")
	}
} else if (distanceOneTwo == distanceOneThree) {
	if (distanceTwoThree < distanceOneTwo) {
		System.out.println("The distance second-third point is the closest.")
	} else if (distanceTwoThree == distanceOneTwo) {
		System.out.println("All the three points are equally close to each other.")
	}
}