fun main(args: Array<String>) {
    val option = arrayOf("камень","ножницы","бумага")
    val gameChoice = getGameChoice(option)
    val userChoice = getUserChoice(option)
    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionsParam: Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    //Выполнять цикл, пока пользователь не введет допустимый вариант
    while (!isValidChoice) {
        //Запросить у пользователя его выбор
        print("Please enter one of the following:")
        for (item in optionsParam) print(" $item")
        println(".")
        //Прочитать пользовательский ввод
        val userInput = readLine()
        //Проверить пользовательский ввод
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        //Если выбран недопустимый вариант, сообщить пользователю
        if (!isValidChoice) println("You must enter a valid choice.")
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String) {
    val result: String
    //Определить результат
    if (userChoice == gameChoice) result = "ничья!"
    else if ((userChoice == "камень" && gameChoice == "ножницы")||
    (userChoice == "бумага" && gameChoice == "камень") ||
    (userChoice == "ножницы" && gameChoice == "бумага")) result = "Ты победил!"
    else result = "Ты проиграл!"
    //Вывести результат
    println("Ты выбрал $userChoice. я выбрал $gameChoice. $result")
}