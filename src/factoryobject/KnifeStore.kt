package factoryobject

class KnifeStore(
    private val knifeFactory: KnifeFactory
) {

    fun orderKnife(type: String) {
        //Pass the type and get the product from factory
        val knife: Knife? = knifeFactory.createKnife(type)

        //Prepare knife
        knife?.sharpen()
        knife?.polish()
        knife?.packageKnife()
    }
}