class Question {
    var answer: String? = ""
    var correctAnswer: String? = ""

    fun printResult() {
        when(answer) {
            correctAnswer -> println("That's correct")
            else -> println("That's incorrect")
        }
    }
}