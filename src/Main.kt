import adapter_design_pattern.WebAdapter
import adapter_design_pattern.WebClient
import adapter_design_pattern.WebRequester
import adapter_design_pattern.WebService
import factory_method_pattern.CarBrands
import factory_method_pattern.ReconditionCarStore
import factoryobject.KnifeFactory
import factoryobject.KnifeStore

fun singletonFunction() {
    val singleton = Singleton.getInstance()
    println("${singleton.name}  ${singleton.roll}")

    val singleton2 = Singleton.getInstance()
    println("${singleton2.name}  ${singleton2.roll}")
}

fun factoryObject() {
    val knifeStore = KnifeStore(KnifeFactory())
    knifeStore.orderKnife("Chef")
}

fun factoryMethodPattern() {
    val myCar = ReconditionCarStore()
    val car = myCar.orderCar(CarBrands.Toyota)
    println("${car.javaClass.simpleName}")
}

fun adapterPattern() {
    val host = "https://google.com/abcd/"
    val service = WebService(host)
    val webAdapter = WebAdapter()
    webAdapter.connect(service)
    val client = WebClient(webAdapter)
    client.doWork()
}

fun compositeDesignPattern() {

}

fun main() {
    //singletonFunction()
    //factoryObject()
    //factoryMethodPattern()
    adapterPattern()
}

