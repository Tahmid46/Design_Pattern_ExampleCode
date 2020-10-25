package chain_of_responsibility

class AddNumbers : Calculator {

    private lateinit var calculator: Calculator

    override fun setNextChain(chain: Calculator) {
        calculator = chain
    }

    override fun calculate(number: Number) {
        if (number.calcWanted == "add") {
            val add = number.number1 + number.number2
            print("$add")
        } else {
            calculator.calculate(number)
        }
    }
}