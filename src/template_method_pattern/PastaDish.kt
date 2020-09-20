package template_method_pattern

abstract class PastaDish {

    //Kotlin methods are by default final. So need to declare final
    fun makeRecipe() {
        boilWater()
        addPasta()
        cookPasta()
        drainAndPlate()
        addSauce()
        addProtein()
        addGarnish()
    }

    private fun boilWater() {
        println("Water boiling..")
    }

    private fun cookPasta() {
        println("Cooking pasta")
    }

    private fun drainAndPlate() {
        println("Inside drainAndPlate()")
    }

    abstract fun addPasta()
    abstract fun addSauce()
    abstract fun addProtein()
    abstract fun addGarnish()
}