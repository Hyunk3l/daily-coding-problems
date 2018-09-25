package main.kotlin

class AddUpToK {
    fun execute(numbers: List<Int>, needle: Int) : Boolean {

        val filteredNumbers = numbers.filter { it <= needle }

        if (filteredNumbers.any { it == needle }) {
            return true
        }

        for(number in filteredNumbers) {
            if ((needle - number) in filteredNumbers) {
                return true
            } else {
                continue
            }
        }
        return false
    }
}
