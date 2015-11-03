print "Enter some text: "
String str = System.console().readLine()
print str + " "
for (i = str.length(); i-- > 0;) {
	print str.charAt(i)
}