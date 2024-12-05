fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers) // Output: [2, 4]

    //Safe handling of empty lists
    val emptyList = emptyList<Int>()
    val firstEvenInEmptyList = emptyList.firstOrNull { it % 2 == 0 }
    println(firstEvenInEmptyList) // Output: null
    
    val firstEven = list.firstOrNull { it % 2 == 0 }
    println(firstEven) //Output: 2
    
    val lastEven = list.lastOrNull { it % 2 == 0 }
    println(lastEven) //Output: 4
    
    val singleOdd = list.singleOrNull { it % 2 != 0 && it > 3 }
    println(singleOdd) // Output: 5
    
    val multipleOdds = list.singleOrNull { it % 2 != 0 }
    println(multipleOdds) //Output: null
} 