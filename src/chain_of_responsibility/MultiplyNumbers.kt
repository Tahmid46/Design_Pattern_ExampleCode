package chain_of_responsibility

class MultiplyNumbers : Calculator {

    private lateinit var calculator: Calculator

    override fun setNextChain(chain: Calculator) {
        calculator = chain
    }

    override fun calculate(number: Number) {
        if (number.calcWanted == "mult") {
            val mult = number.number1 * number.number2
            print("$mult")
        } else {
            calculator.calculate(number)
        }
    }
}