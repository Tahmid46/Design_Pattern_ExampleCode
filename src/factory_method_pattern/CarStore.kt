package factory_method_pattern

abstract class CarStore {

    fun orderCar(brand: CarBrands): Car{
        val car: Car = carFactory(brand)
        return car
    }

    abstract fun carFactory(brand: CarBrands): Car

}