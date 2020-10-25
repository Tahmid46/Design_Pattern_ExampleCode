package chain_of_responsibility

class SubtractNumbers : Calculator {

    private lateinit var calculator: Calculator

    override fun setNextChain(chain: Calculator) {
        calculator = chain
    }

    override fun calculate(number: Number) {
        if (number.calcWanted == "sub") {
            val sub = number.number1 - number.number2
            print("$sub")
        } else {
            calculator.calculate(number)
        }
    }
}