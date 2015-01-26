
double side;
double base;
Point A = new Point();				// it will work also with swapped inputs
Point B = new Point();				// (e.g. upRight and downLeft)
System.out.print("Please enter the x coordinate of the point at the top-left corner: ");
String s = System.console().readLine();
A.x = Double.parseDouble(s);
System.out.print("Please enter the y coordinate of the point at the top-left corner: ");
s = System.console().readLine();
A.y = Double.parseDouble(s);
System.out.print("Please enter the x coordinate of the point at the bottom-right corner: ");
s = System.console().readLine();
B.x = Double.parseDouble(s);
System.out.print("Please enter the y coordinate of the point at the bottom-right corner: ");
s = System.console().readLine();
B.y = Double.parseDouble(s);

Rectangle R = new Rectangle();
R.upLeft = A;
R.downRight = B;

side = Math.abs(R.downRight.y-R.upLeft.y);	// abs value is a much better idea
base = Math.abs(R.downRight.x-R.upLeft.x);	// than checking which is larger with ifs

if (R.upLeft.y == R.downRight.y || R.upLeft.x == R.downRight.x){
	System.out.println("These two points are on the same axis.");
	System.out.println("It isn't possible to output a rectangle with this data.")
} else if (side==base) {
	System.out.println("This is a square rather than a rectangle.");
}
System.out.println("Perimeter is " + 2*(side+base) + ", area is " + base*side);