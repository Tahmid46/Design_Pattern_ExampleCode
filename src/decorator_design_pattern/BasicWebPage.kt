package decorator_design_pattern

/**
 * This is the concrete component class which acts as a building block for all
 * the classes
 */
class BasicWebPage : WebPage {
    private val html: String = "...."
    private val css: String = "..."
    private val scripts: String = "..."
    override fun display() {
        println("This is a basic webpage")
    }
}