fun main(args: Array<String>) {
    var list = mutableListOf<Int>()
    print("Please Enter the Total Number of Elements :")
    var number = readLine()!!.toInt()
    for (i in 1..number) {
        print("Please enter the $i Element :")
        var value = readLine()!!.toInt()
        list.add(value)
    }
    val sorted = bubbleSort(list)
    println("The Sorted List in Ascending Order : $sorted")
}


fun bubbleSort(numbers: MutableList<Int>): MutableList<Int> {
    val n = numbers.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (numbers[j] > numbers[j + 1]) {
                // Swap numbers[j] and numbers[j + 1]
                val temp = numbers[j]
                numbers[j] = numbers[j + 1]
                numbers[j + 1] = temp
            }
        }
    }
    return numbers
}