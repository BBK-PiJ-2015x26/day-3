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

// Fourth point
Point point4 = new Point()
print "enter fourth x co-ordinate: "
point4.x = Double.parseDouble(System.console().readLine())
print "enter fourth y co-ordinate: "
point4.y = Double.parseDouble(System.console().readLine())

// Fifth point
Point point5 = new Point()
print "enter fifth x co-ordinate: "
point5.x = Double.parseDouble(System.console().readLine())
print "enter fifth y co-ordinate: "
point5.y = Double.parseDouble(System.console().readLine())

// Create Rectangle 1
Rectangle myRectangle1 = new Rectangle()
myRectangle1.upLeft = point1
myRectangle1.downRight = point2

// Create Rectangle 2
Rectangle myRectangle2 = new Rectangle()
myRectangle2.upLeft = point3
myRectangle2.downRight = point4


// Checks if point is inside first rectangle
boolean inRectangle1 = true
if (point5.x < myRectangle1.upLeft.x) {
	inRectangle1 = false
} else if (point5.y > myRectangle1.upLeft.y) {
	inRectangle1 = false
} else if (point5.x > myRectangle1.downRight.x) {
	inRectangle1 = false
} else if (point5.y < myRectangle1.downRight.y) {
	inRectangle1 = false
} else {
	inRectangle1 = true
}

// Checks if point is inside second rectangle
boolean inRectangle2 = true
if (point5.x < myRectangle2.upLeft.x) {
	inRectangle2 = false
} else if (point5.y > myRectangle2.upLeft.y) {
	inRectangle2 = false
} else if (point5.x > myRectangle2.downRight.x) {
	inRectangle2 = false
} else if (point5.y < myRectangle2.downRight.y) {
} else {
	inRectangle2 = true
}

// Tells whether point is in one, the other or both
if (inRectangle1 == true && inRectangle2 == true) {
	println "Inside both rectangles"
} else if (inRectangle1 == true && inRectangle2 == false) {
	println "inside first rectangle"
} else if (inRectangle1 == false && inRectangle2 == true) {
	println "inside second rectangle"
} else if (inRectangle2 == false && inRectangle2 == false) {
	println "outside both rectangles"
} else {
	println "something"
}


class Point {
	double x
	double y
}

class Rectangle {
	Point upLeft
	Point downRight
}