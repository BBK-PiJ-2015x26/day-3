// First point
Point point1 = new Point()
print "enter first x co-ordinate: "
point1.x = Double.parseDouble(System.console().readLine())
print "enter first y co-ordinate: "
point1.y = Double.parseDouble(System.console().readLine())

// Second point
Point point2 = new Point()
print "enter second x co-ordinate: "
point2.x = Double.parseDouble(System.console().readLine())
print "enter second y co-ordinate: "
point2.y = Double.parseDouble(System.console().readLine())

// Third point
Point point3 = new Point()
print "enter third x co-ordinate: "
point3.x = Double.parseDouble(System.console().readLine())
print "enter a third y co-ordinate: "
point3.y = Double.parseDouble(System.console().readLine())

// Create Rectangle
Rectangle myRectangle = new Rectangle()
myRectangle.upLeft = point1
myRectangle.downRight = point2

if (point3.x < myRectangle.upLeft.x) {
	println "Outside of rectangle"
} else if (point3.y > myRectangle.upLeft.y) {
	println "Outside of rectangle"
} else if (point3.x > myRectangle.downRight.x) {
	println "Outside of rectangle"
} else if (point3.y < myRectangle.downRight.y) {
	println "Outside of rectangle"
} else {
	println "Inside rectangle"
}

class Point {
	double x
	double y
}

class Rectangle {
	Point upLeft
	Point downRight
}