fun main(args: Array<String>) {
    var nums = Array(10) {i -> i * 3}
    for (num in nums) {
        print("$num ")
    }
    //Range
    for (i in 1..10) {
        print("$i ")
    }
    //Sum
    var sum = 0
    for (num in nums) {
        sum += num // Same than sum = sum + num
    },
    println("Sum = $sum")
    //Nested loops
    for (i in 1..5) {
        for (j in 1..3) {
            print("$i")
        }
        print("\n")
    }
    //forEach
    ("Hello World").forEach {
        println(it)
    }
    //While loops
    var i = 1
    while (i <= 10) {
        print("$i ")
        i++
    }
    //break
    for (i in 1..10) {
        if (i == 5)
            break
            print("$i ")
        }
    //Continue = skip
    for (i in 1..10) {
        if (i == 5)
            continue
            print("$i ")
        }
    //Step
    for (i in 5..50 step 5) {
        print("$i ")
    }
    //Factorial
    println("Type an integer:")
    val num = readLine()!!.toInt()
    var fact = 1
    for(i in 1..num) {
        fact *=i
    }
    println("The factorial of $num = $fact")
    //Average
    val nums = arrayOf(11, 16, 7, 8, 14, 5, 9, 3)
    var sum = 0
    nums.forEach {
        sum += it
    }
    val average = sum.toDouble() / nums.size
    println("Average = $average")
    //Do while
    var sum = 0
    var word: String?
    do {
        println("Type a word (Type x to exit)")
        word = readLine()
        if (word != null && word != "x") {
            sum += 1
        }
    } while (word != "x")
    println("You typed $sum words")
}