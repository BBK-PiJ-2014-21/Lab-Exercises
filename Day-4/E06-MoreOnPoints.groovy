// 6. More on points

class Point {
	double x;
	double y;

	double distanceTo(Point point) {
		double distance = Math.sqrt(Math.pow((this.x-point.x),2) + Math.pow((this.y-point.y),2));
		return distance;
	}
	
	double distanceToOrigin() {
		Point origin = new Point();
		origin.x = 0.0;
		origin.y = 0.0;
		return distanceTo(origin);
	}
	
	void moveTo(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	void moveTo(Point point) {
		this.x = point.x;
		this.y = point.y;
	}
	
	Point clone() {
		Point newPoint = new Point();
		newPoint.x = this.x;
		newPoint.y = this.y;
		return newPoint;
	}
	
	Point opposite() {
		Point newPoint = new Point();
		newPoint.x = this.x * -1;
		newPoint.y = this.y * -1;
		return newPoint;
	}
		
	
}


		