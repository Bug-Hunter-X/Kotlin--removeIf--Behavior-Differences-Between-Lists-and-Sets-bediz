fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    // Solution for sets: Create a copy and iterate over the copy
    val set = mutableSetOf(1, 2, 3, 4, 5)
    val setCopy = set.toSet() // Create a copy
    val toRemove = mutableSetOf<Int>()
    for(element in setCopy) {
        if (element > 2) {
            toRemove.add(element)
        }
    }
    set.removeAll(toRemove)
    println(set) // Output: [1, 2]
    
    //Alternative using filter
    val set2 = mutableSetOf(1, 2, 3, 4, 5)
    val filteredSet = set2.filter { it <=2 }.toSet()
    println(filteredSet) //Output: [1, 2]
}