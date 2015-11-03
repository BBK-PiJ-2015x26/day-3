print "Enter some text: "
String str = System.console().readLine()
boolean palindrome = true
int count = 0
for (i = str.length(); i-- > 0;) {
	if (str.charAt(i) != str.charAt(count)) {
		palindrome = false
		break
	} else {
		count += 1
	}
}
if (palindrome == true) {
	println "Is Palindrome"
} else if (palindrome == false) {
	println "Is not a Palindrome"
}