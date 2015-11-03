Point a = new Point()
println "enter first x co-ordinate: "
a.x = Double.parseDouble(System.console().readLine())
println "enter first y co-ordinate: "
a.y = Double.parseDouble(System.console().readLine())

Point b = new Point()
println "enter second x co-ordinate: "
b.x = Double.parseDouble(System.console().readLine())
println "enter second y co-ordinate: "
b.y = Double.parseDouble(System.console().readLine())

Point c = new Point()
println "enter third x co-ordinate: "
c.x = Double.parseDouble(System.console().readLine())
println "enter a third y co-ordinate: "
c.y = Double.parseDouble(System.console().readLine())

double distatob = Math.sqrt((a.x - b.x) ** 2 + (a.y - b.y) **2)
double distatoc = Math.sqrt((a.x - c.x) ** 2 + (a.y - c.y) **2)
double distbtoc = Math.sqrt((b.x - c.x) ** 2 + (b.y - c.y) **2)


if (distatob < distatoc && distatob < distbtoc) {
	println ("First and second points are closest")
} else if (distatoc < distatob && distatoc < distbtoc) {
	println ("First and third points are closest")
} else if (distbtoc < distatob && distbtoc < distatoc) {
	println ("Second and third co-ordinates are closest")
} else {
	println "error"
}

class Point {
	double x
	double y
}

