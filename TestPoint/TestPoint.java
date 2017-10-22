class Point {
	double x, y, z;
	Point(double x1, double y1, double z1) {
		x = x1;
		y = y1;
		z = z1; 
	}


	void setX(double x1) {
		x = x1;
	}

	void setY(double y1) {
		y = y1;
	}

	void setZ(double z1) {
		z = z1;
	}

	double getDistance(Point p) {
		return (x - p.x)*(x - p.x) + (y - p.y)*(y - p.y) + (z - p.z)*(z - p.z);
	}
}

public class TestPoint {
	
	public static void main(String[] args) {
		Point p = new Point(1.0, 2.0, 3.0);
		Point p1 = new Point(1.0, 1.0, 1.0);
		System.out.println(p.getDistance(p1));
		p.setY(3.0);
		System.out.println(p.getDistance(p1));
		System.out.println(p.getDistance(new Point(1.0, 2.0, 1.0)));
		
		
	} 
}