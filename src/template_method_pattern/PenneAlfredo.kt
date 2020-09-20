package template_method_pattern

class PenneAlfredo : PastaDish() {

    override fun addPasta() {
        println("Add penne")
    }

    override fun addSauce() {
        println("Add Alfredo sauce")
    }

    override fun addProtein() {
        println("Add chicken")
    }

    override fun addGarnish() {
        println("Add parsley")
    }

}