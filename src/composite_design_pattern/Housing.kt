package composite_design_pattern

/**
 * Implementation of composite class
 */
class Housing(
        private val address: String
) : IStructure {

    private val structures = mutableListOf<IStructure>()

    fun addStructure(component: IStructure): Int {
        structures.add(component)
        return structures.size-1
    }

    fun getStructure(componentNumber: Int): IStructure {
        return structures[componentNumber]
    }

    override fun enter() {
        println("Entered...$address")
    }

    override fun exit() {
        println("Exit...$address")
    }

    override fun location() {
        println("You are currently in ${this.getName()}. It has: ")
        for (struct in structures) println("${struct.getName()}")
    }

    override fun getName(): String {
        return address
    }
}