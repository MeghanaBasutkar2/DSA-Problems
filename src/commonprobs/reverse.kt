package commonprobs

var reverse = 0
fun main() {
    reverseNum(12345)
}

fun reverseNum(number: Int): Int {
    if (number % 10 <= 0) {
        //checks for last digit. For example: 1%10 = 1, 5%10=5. But 0%10 =0
        // for the last number - number/10 becomes 0 and 0%10 = 0, hence it enters base case
        print(reverse)
        return reverse
    } else {
        var lastDigit = number % 10
        reverse = (reverse * 10) + lastDigit
        return reverseNum(number / 10)
    }
}
