fun main() {

    //Задача 1
    val numbers = List(20) { it + 1 }
    println("Решение для задачи 1: " + numbers.drop(5).count())

    //Задача 2
    println("Решение для задачи 2: " + numbers.take(7).sum())

    //Задача 3
    val words = listOf("one", "two", "three")
    println("Решение для задачи 3: " + words.map { it.toCharArray().toList() }.flatten())

    //Задача 4
    val strings = listOf("a", "bb", "ccc", "dddd")
    println("Пример работы решения для задачи 4: " + getLongestStringFromList(strings))

    //Задача 5
    val products = listOf(
        Product("Apple", 7),
        Product("Orange", 12),
        Product("Melon", 3),
        Product("Banana", 5),
        Product("Pineapple", 5)
    )
    println("Решения для задачи 5: " + products.map { it.count }.fold (0) {acc, i -> acc + i })
}

//Функция для задачи 4
fun getLongestStringFromList(list: List<String>) = list.maxBy { it.length }

//Класс для задачи 5
class Product(val name: String, val count: Int)