package factoryobject

class KnifeFactory {

    fun createKnife(type: String): Knife? {
        var knife: Knife? = null
        if(type == "Steak") {
            knife = SteakKnife()
        } else if(type == "Chef") {
            knife = ChefKnife()
        }
        return knife
    }
}