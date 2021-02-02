import java.io.FileReader
import java.lang.NumberFormatException
import java.util.*

fun main(args: Array<String>) {
    println("Hello World")
    var employee = Employee("Jack")
    //employee.name = "Jack"

    println("My name is ${employee.name}")
    employee.printEmployeeName()

    var message = if(employee.name == "Jack") {
        "Correct"
    } else {
        "Incorrect"
    }
    println(message)

    var q: Question? = Question()
    q?.answer = "30"
    q?.correctAnswer = "30"
    q?.printResult()

    var answerAsNumber: Int = try{
        Integer.parseInt(q?.answer)
    } catch (e: NumberFormatException) {
        -1
    }

    var answerAsNumberNull: Int? = try{
        Integer.parseInt(q?.answer)
    } catch (e: NumberFormatException) {
        null
    }

    var myNum = 1..5
    var myChar = 'a'..'e'
    for (i in myNum) {
        print(i)
    }
    for (i in myChar) {
        print(i)
    }

    var numbers = listOf(1, 2, 3, 4, 5)
    for(i in numbers) {
        println(i)
    }

    for((index, element) in numbers.withIndex()) {
        println("$element at $index")
    }

    for(i in 1..10) {
        print(i)
    }
    for(i in 1 until 10) {
        println(i)
    }
    for(i in 1..10 step 2) {
        println(i)
    }
    for(i in 10 downTo 1) {
        println(i)
    }

    var ages = TreeMap<String, Int>()
    ages["Tom"] = 23
    ages["Lisa"] = 43
    ages["Alex"] = 71

    for((firstName, age) in ages) {
        println("My name is $firstName and I am $age years old")
    }

    var reader = FileReader("filename")
    reader.read()
}
