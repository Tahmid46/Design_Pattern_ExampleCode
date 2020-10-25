package chain_of_responsibility

class DevideNumbers : Calculator {

    private lateinit var calculator: Calculator

    override fun setNextChain(chain: Calculator) {
        calculator = chain
    }

    override fun calculate(number: Number) {
        if (number.calcWanted == "div") {
            val div = number.number1 / number.number2
            print("$div")
        } else {
            println("Unsatisfiable requuest")
        }
    }
}