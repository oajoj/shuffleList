import kotlin.random.Random

fun main(){
    var list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    list.shuffleList().forEach { print("$it ") }
}

fun MutableList<Int>.shuffleList(): MutableList<Int> {
    for(i in 0 until this.size){
        var randomIndex = Random.nextInt(0, this.size - 1)
        var temp = this[randomIndex]
        this[randomIndex] = this[i]
        this[i] = temp
    }
    return this
}