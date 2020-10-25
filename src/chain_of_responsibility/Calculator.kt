package chain_of_responsibility

interface Calculator {
    /**
     * This method is responsible for setting the next object in the chain
     * @param [Calculator] type object
     */
    fun setNextChain(chain: Calculator)

    /**
     * Responsible of doing calculation that the concrete class intended to do
     */
    fun calculate(number: Number)
}