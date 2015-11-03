//Takes input from user
print "Enter some text: "
String str = System.console().readLine()
println "Enter a letter: "
String letter = System.console().readLine()
count = 0
for (i = 0; i < str.length(); i++) {
	if (str.charAt(i) == letter) {
		count = count + 1
	}
}
println count
	
	