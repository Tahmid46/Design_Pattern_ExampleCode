package chain_of_responsibility

fun main() {

    val number = Number(1,2,"add")

    val addNumbers = AddNumbers()
    val subtractNumbers = SubtractNumbers()
    val multiplyNumbers = MultiplyNumbers()
    val devideNumbers = DevideNumbers()

    addNumbers.setNextChain(subtractNumbers)
    subtractNumbers.setNextChain(multiplyNumbers)
    multiplyNumbers.setNextChain(devideNumbers)

    addNumbers.calculate(number)
}