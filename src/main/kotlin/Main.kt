fun main(args: Array<String>) {
    val option = arrayOf("камень","ножницы","бумага")
    val gameChoice = getGameChoice(option)

}

fun getGameChoice(optionsParam: Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()]