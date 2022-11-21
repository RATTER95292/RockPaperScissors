fun main(args: Array<String>) {
    val option = arrayOf("камень","ножницы","бумага")
    val gameChoice = getGameChoice(option)

}

fun getGameChoice(optionsParam: Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    //Запросить у пользователя его выбор
    print("Please enter one of the following:")
    for (item in optionsParam) print(" $item")
    println(".")
    val userInput = readLine()
    return ""
}