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

// Create Rectangle
Rectangle myRectangle = new Rectangle()
myRectangle.upLeft = point1
myRectangle.downRight = point2

// Calculate Perimeter 
double width = myRectangle.downRight.x - myRectangle.upLeft.x
double height = myRectangle.upLeft.y - myRectangle.downRight.y
double perimeter = 2 * (width + height)

// Calculate Area
double area = width * height 

println "Perimeter is " + perimeter
println "Area is " + area


class Point {
	double x
	double y
}

class Rectangle {
	Point upLeft
	Point downRight
}