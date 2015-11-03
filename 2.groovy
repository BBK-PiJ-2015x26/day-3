print "Enter a number: "
str = System.console().readLine()
double d1 = Double.parseDouble(str)
print "Enter another number: "
str = System.console().readLine()
double d2 = Double.parseDouble(str)
print "Enter an operator: "
String op = System.console().readLine()
if (op == "+") {
	result = d1 + d2
	println result
} else if (op == "-") {
	result = d1 - d2
	println result
} else if (op == "*") {
	result = d1 * d2
	println result
} else if (op == "/") {
	result = d1 / d2
	println result
} else {
	println "wrong"
}