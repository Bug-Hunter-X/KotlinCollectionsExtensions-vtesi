fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers) // Output: [2, 4]

    //This will throw an exception when the list is empty
    val firstEven = list.first { it % 2 == 0 }
    println(firstEven) // Output: 2
    val emptyList = emptyList<Int>()
    //val firstEvenInEmptyList = emptyList.first { it % 2 == 0 } // This line throws NoSuchElementException
    val firstEvenInEmptyList = emptyList.firstOrNull { it % 2 == 0 }
    println(firstEvenInEmptyList) //Output: null
}