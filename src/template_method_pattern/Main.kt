package template_method_pattern

/**
 * Main driver method for this patter
 */
fun main() {
    var pastaDish: PastaDish = SpaghettiMeatBalls()
    pastaDish.makeRecipe()
    println()
    println("Now ${PenneAlfredo::class.java.simpleName}")
    println()
    pastaDish = PenneAlfredo()
    pastaDish.makeRecipe()
}