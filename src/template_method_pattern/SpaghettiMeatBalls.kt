package template_method_pattern

class SpaghettiMeatBalls : PastaDish() {

    override fun addGarnish() {
        println("Add parmesan cheese")
    }

    override fun addPasta() {
        println("Add spaghetti")
    }

    override fun addProtein() {
        println("Add meatballs")
    }

    override fun addSauce() {
        println("Add tomato sauce")
    }
}