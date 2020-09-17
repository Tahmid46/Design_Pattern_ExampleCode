package composite_design_pattern

interface IStructure {
    fun enter()
    fun exit()
    fun location()
    fun getName(): String
}